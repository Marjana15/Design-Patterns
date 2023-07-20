// Parent class
public class Department 
{
    protected String name; // Variable declaration with access modifier
    
    public Department(String name) { // Constructor with parameter
        this.name = name;
    }
    
    public void printName() { // Method without parameters
        System.out.println("Department: " + name);
    }
}

// Child class inheriting from Department
class Student extends Department {
    private String studentId; // Variable declaration
    
    public Student(String name, String studentId) { // Constructor with parameters
        super(name); // Calling superclass constructor
        this.studentId = studentId;
    }
    
    public void displayInfo() { // Method without parameters
        System.out.println("Student ID: " + studentId);
    }
    
    public void enroll(String course) { // Method with parameter
        System.out.println("Student " + studentId + " enrolled in " + course + ".");
    }
}