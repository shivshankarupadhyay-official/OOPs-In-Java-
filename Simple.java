// -------- Simple Inheritance Example --------

// Superclass / Parent class
class Student {

    // Data members of Student class
    int roll;
    int marks;
    String name;

    // Method of Student class
    void input() {
        System.out.println("Enter roll, name and marks:");
    }
}


// Subclass / Child class
// Joe inherits Student using the 'extends' keyword
class Joe extends Student {

    // Method of Joe class
    void display() {

        // These variables are inherited from Student class
        roll = 1;
        name = "Joe";
        marks = 99;

        // Display student details
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Main method
    public static void main(String[] args) {

        // Creating an object of Joe class
        Joe obj = new Joe();

        // Calling the inherited input() method
        obj.input();

        // Calling the display() method of Joe class
        obj.display();
    }
}