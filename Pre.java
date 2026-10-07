//Java program to demonstrate Private constructor

class Pre{
    int a;
    double b;
    String c;

    private Pre()
    {
        a = 100; b = 92.3; c = "PRIVATE CONSTRUCTOR";
        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        Pre obj = new Pre();
         
    }
}