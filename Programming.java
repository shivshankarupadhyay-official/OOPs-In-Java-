
 // Abstract class
abstract class Programming {

    // Abstract method: declaration only, no body
    public abstract void Developer();
}

// Html class inherits Programming
class Html extends Programming {

    // Provides implementation of the abstract method
    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
}

// Java class inherits Programming
class Java extends Programming {

    // Provides implementation of the abstract method
    @Override
    public void Developer() {
        System.out.println("James Gosling");
    }
}

// Main class: program execution starts here
class Main {
    public static void main(String[] args) {

        // Create an object of Html class
        Html h = new Html();
        h.Developer();

        // Create an object of Java class
        Java j = new Java();
        j.Developer();
    }
}
