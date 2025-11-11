public class Student {
    private final String name;
    private int nrOfTasks = 0;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNrOfTasks() {
        return this.nrOfTasks;
    }

    public void addNrOfTasks(int nrOfNewTasks) {
        this.nrOfTasks += nrOfNewTasks;
    }

    public String toString() {
        return  this.name + ", " + Integer.toString(this.nrOfTasks);
    }
}
