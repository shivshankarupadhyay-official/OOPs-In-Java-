class Main {
    public static void main(String[] args) {

        try {
            int age = 15;

            if (age < 18) {
                throw new ArithmeticException("Not eligible");
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues");
    }
}