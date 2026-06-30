class Task1 {
    int taskId;
    String taskName;
    String status;

    public Task1(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public void display() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + taskName);
        System.out.println("Status: " + status);
        System.out.println("---------------------");
    }
}
