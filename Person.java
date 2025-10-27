package student;

//student's basic details
public class Person {
     String name;
     int rollNo;
    int marks;

    public Person(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Converts student data into a CSV format
    @Override
    public String toString() {
        return name + "," + rollNo + "," + marks + "\n";
    }

    public String getName() {
        return name;
    }
}



