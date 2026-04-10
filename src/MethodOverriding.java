class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee {
    @Override
    void display() {
        // First print the Engineer's message
        System.out.println("Name of class is Engineer");
        // Then use the super keyword to call the base class's display method
        super.display();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // 1. Create an Engineer object.
        Engineer myEngineer = new Engineer();
        
        // 2 & 3. Call display() on it (which will also call super.display() internally)
        myEngineer.display();
    }
}