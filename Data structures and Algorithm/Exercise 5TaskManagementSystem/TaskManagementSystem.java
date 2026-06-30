class Task{
    int taskId;
    String taskName;
    String status;
    public Task(int taskId, String taskName, String status) {
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
class Node {
    Task task;
    Node next;
    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
class TaskManagement {
    private Node head;
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // Search Task
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }
    // Traverse Tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp.task.display();
            temp = temp.next;
        }
    }
    // Delete Task
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task List Empty.");
            return;
        }
        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }
        Node temp = head;
        while (temp.next != null &&
               temp.next.task.taskId != taskId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Task Not Found.");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Task Deleted Successfully.");
    }
}
public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskManagement manager = new TaskManagement();
        manager.addTask(
                new Task(1,
                        "Design Database",
                        "Pending"));
        manager.addTask(
                new Task(2,
                        "Develop Backend",
                        "In Progress"));
        manager.addTask(
                new Task(3,
                        "Testing",
                        "Pending"));

        System.out.println("All Tasks:");
        manager.traverseTasks();
        System.out.println("\nSearching Task ID 2");
        Task task = manager.searchTask(2);
        if (task != null) {
            task.display();
        } else {
            System.out.println("Task Not Found");
        }
        System.out.println("\nDeleting Task ID 2");
        manager.deleteTask(2);
        System.out.println("\nTasks After Deletion:");
        manager.traverseTasks();
    }
}