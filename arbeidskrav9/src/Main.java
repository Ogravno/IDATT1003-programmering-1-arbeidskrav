import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        TaskOverview taskOverview = new TaskOverview();

        while (true) {
            System.out.println("1: Add student");
            System.out.println("2: Add task to student");
            System.out.println("3: Show student's number of tasks");
            System.out.println("4: Show students");
            int choice = inputScanner.nextInt();
            inputScanner.nextLine();

            int i;
            switch (choice) {
                case 1:
                    System.out.println("Student's name:");
                    String newStudentName = inputScanner.nextLine();
                    taskOverview.addStudent(newStudentName);
                    break;
                case 2:
                    taskOverview.printStudentsMenu();
                    i = inputScanner.nextInt() - 1;
                    System.out.println("Number of tasks to add: ");
                    int nrOfTasks = inputScanner.nextInt();
                    inputScanner.nextLine();
                    taskOverview.addNrOfTasks(i, nrOfTasks);
                    break;
                case 3:
                    taskOverview.printStudentsMenu();
                    i = inputScanner.nextInt() - 1;
                    inputScanner.nextLine();
                    System.out.println(taskOverview.getNrOfTasks(i));
                case 4:
                    System.out.println(taskOverview.toString());
                    break;
            }
        }
    }
}
