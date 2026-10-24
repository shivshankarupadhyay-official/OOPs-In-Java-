
 // ----------- Encapsulation -----------

class A {
    private int value; // Private variable: data hiding

    // Setter method: used to assign a value
    public void setValue(int x) {
        value = x; // Stores the value of x in value
    }

    // Getter method: used to return the stored value
    public int getValue() {
        return value; // Returns the value stored in value
    }
}

class B {
    public static void main(String[] args) {

        A r = new A(); // Creates an object of class A

        r.setValue(100); // Calls setter and stores 100 in value

        System.out.print(r.getValue()); // Calls getter and prints 100
    }
}

