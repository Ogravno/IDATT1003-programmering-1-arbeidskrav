import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOverview {
    private ArrayList<Student> students = new ArrayList<>();
    private int nrOfStudents = 0;

    public int getNrOfStudents() {
        return this.nrOfStudents;
    }

    public int getNrOfTasks(int studentIndex) {
        return this.students.get(studentIndex).getNrOfTasks();
    }

    public void addStudent(String name) {
        this.students.add(new Student(name));
        nrOfStudents += 1;
    }

    public void addNrOfTasks(int studentIndex, int nrOfNewTasks) {
        this.students.get(studentIndex).addNrOfTasks(nrOfNewTasks);
    }

    public void printStudentsMenu() {
        for (int i = 0; i < this.nrOfStudents; i++) {
            System.out.println((i+1) + ": " + this.students.get(i).getName());
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Student student : this.students) {
            result.append(student.toString()).append("\n");
        }
        return result.toString();
    }
}
