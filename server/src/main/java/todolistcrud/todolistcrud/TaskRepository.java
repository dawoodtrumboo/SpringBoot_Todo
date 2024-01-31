    package todolistcrud.todolistcrud;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    import todolistcrud.todolistcrud.Task;
    @Repository
    public interface TaskRepository extends JpaRepository<Task, Long> {
    }