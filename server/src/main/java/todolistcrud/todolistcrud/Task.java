    package todolistcrud.todolistcrud;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;

    @Entity
    public class Task {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String description;
        private boolean isCompleted;

        public Task() {
            // Default constructor for JPA
        }

        public Task(String description, boolean isCompleted) {
            this.description = description;
            this.isCompleted = isCompleted;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void setCompleted(boolean completed) {
            isCompleted = completed;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "id=" + id +
                    ", description='" + description + '\'' +
                    ", isCompleted=" + isCompleted +
                    '}';
        }
    }
