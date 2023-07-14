public class Main{
    public static void main(String[] args) 
    {
        // Object creation
        Student student = new Student("Software Engineering", "221-134-020");
        
        // Accessing inherited variable
        student.printName();
        
        // Accessing variable of child class
        student.displayInfo();
        
        // Accessing method of child class
        student.enroll("Software Architecture and Design Pattern");
    }
}