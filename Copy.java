//Java program to demonstrate copy constructor

class Copy {

    int a;
    String b;

    Copy() {
        a = 10;
        b = "HELLO";

        System.out.println(a + " " + b);
    }

    Copy(Copy ref) {
        a = ref.a;
        b = ref.b;

        System.out.println(a + " " + b);
    }
}

class B {

    public static void main(String[] args) {

        Copy r = new Copy();

        Copy r2 = new Copy(r);
    }
}