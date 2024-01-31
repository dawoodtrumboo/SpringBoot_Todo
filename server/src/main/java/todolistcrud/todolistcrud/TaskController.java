    package todolistcrud.todolistcrud;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    // import todolistcrud.todolistcrud.TaskRepository;

    import java.util.List;

    @RestController
    @RequestMapping("/todos")  // Corrected endpoint path
    public class TaskController {

        @Autowired
        private TaskRepository taskRepository;

        @GetMapping
        public List<Task> getAllTasks() {
            return taskRepository.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
            return taskRepository.findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping
        public Task createTask(@RequestBody Task task) {
            return taskRepository.save(task);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
            return taskRepository.findById(id)
                    .map(task -> {
                        task.setDescription(updatedTask.getDescription());
                        task.setCompleted(updatedTask.isCompleted()); // Use isCompleted() instead of isIsCompleted()
                        return ResponseEntity.ok(taskRepository.save(task));
                    })
                    .orElse(ResponseEntity.notFound().build());
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> deleteTask(@PathVariable Long id) {
            return taskRepository.findById(id)
                    .map(task -> {
                        taskRepository.delete(task);
                        return ResponseEntity.ok().build();
                    })
                    .orElse(ResponseEntity.notFound().build());
        }
    }
