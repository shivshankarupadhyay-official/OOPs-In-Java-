class Main {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("First exception caught");

            try {
                int arr[] = {10, 20};
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Second exception caught");
            }
        }

        System.out.println("Program continues");
    }
}