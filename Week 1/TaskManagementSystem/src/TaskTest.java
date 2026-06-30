public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList tasks = new TaskLinkedList();

        tasks.addTask(101,
                "Complete Assignment",
                "Pending");

        tasks.addTask(102,
                "Prepare Presentation",
                "Pending");

        tasks.addTask(103,
                "Submit Report",
                "Completed");

        tasks.displayTasks();

        System.out.println();

        System.out.println("Searching Task");

        Task task = tasks.searchTask(102);

        if(task != null)

            System.out.println(task);

        else

            System.out.println("Task Not Found");

        System.out.println();

        tasks.deleteTask(102);

        tasks.displayTasks();

    }

}