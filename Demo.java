class Demo {
    @Override
    protected void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        d = null; // Object becomes eligible for GC

        System.gc(); // Request garbage collection

        System.out.println("Main method ends");
    }
}