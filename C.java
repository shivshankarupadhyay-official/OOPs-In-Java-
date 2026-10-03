class A{
    int a;
    String b;
    boolean c;

    A(){
        a = 100; b = "Japan"; c= true;

    }
    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
    
}

class C{
    public static void main(String[] args) {
        A obj = new A();
        obj.Disp();
    }
}
