class D {

    int x, y;

    // Constructor
    // x aur y ki value receive karega
    D(int a, int b) {

        // a ki value x mein store hogi
        x = a;

        // b ki value y mein store hogi
        y = b;
    }

    // x aur y ko display karne wala method
    void Disp() {

        System.out.println(x + " " + y);
    }
}


class E {

    // Program execution yahan se start hoti hai
    public static void main(String[] args) {

        // D class ka object create kar rahe hain
        // Constructor ko 100 aur 200 pass kar rahe hain
        D obj = new D(100, 200);

        // Disp() method ko call kar rahe hain
        obj.Disp();
    }
}