
// ----- EXTENDING INTERFACES -----

interface Gill {
    void add();
}

interface Raj extends Gill {
    void sub();
}

class Ankit implements Raj {

    @Override
    public void add() {
        int a = 10, b = 20;
        int c = a + b;
        System.out.println("ADDITION: " + c);
    }

    @Override
    public void sub() {
        int a = 109, b = 20;
        int c = a - b;
        System.out.println("SUBTRACTION: " + c);
    }
}

class Main {
    public static void main(String[] args) {
        Raj r = new Ankit();
        r.add();
        r.sub();
    }
}
