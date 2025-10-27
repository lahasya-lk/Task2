package student;

// A thread that handles writing a students info into a file

public class PersonThread extends Thread {
     final FileHandler handler;
     final Person student;

    public PersonThread(FileHandler handler, Person student) {
        this.handler = handler;
        this.student = student;
    }

    @Override
    public void run() {
        handler.writeToFile(student);
    }
}
