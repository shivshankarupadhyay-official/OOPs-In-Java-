class Main {
    public static void main(String[] args) {

        try {
            int a = 10 / 2;
            System.out.println("a = " + a);

            try {
                int arr[] = {10, 20, 30};
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array error");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Division error");
        }

        System.out.println("Program continues");
    }
}
