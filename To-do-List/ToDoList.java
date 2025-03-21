
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{

    static class Task {
        String description;
        boolean isCompleted;

        Task(String description) {
            this.description = description;
            this.isCompleted = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n To-Do List Menu:");
            System.out.println("1.Add Task");
            System.out.println("2.View Tasks");
            System.out.println("3.Mark Task as Completed");
            System.out.println("4.Delete Task");
            System.out.println("5.Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = sc.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("✅ Task added!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\n Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = tasks.get(i).isCompleted ? "✅" : "❗";
                            System.out.println((i + 1) + ". " + tasks.get(i).description + " " + status);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int completeIndex = sc.nextInt() - 1;
                    if (completeIndex >= 0 && completeIndex < tasks.size()) {
                        tasks.get(completeIndex).isCompleted = true;
                        System.out.println(" Task marked as completed!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = sc.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        System.out.println(" Task deleted!");
                    } else {
                        System.out.println("❌ Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting To-Do List. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice! Please try again.");
            }
        }
    }
}
