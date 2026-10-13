class A{
    int a,b,c;
    void add(){
        a = 10;
        b = 20;
        c = a+b;
        System.out.println("Sum of two numbers: "+ c);

    }

    void sub()
    {
        a = 200; b = 100;
        c = a-b;
        System.out.println("Sub of two numbers: "+ c);

    }
}

class B extends A{
    void mult(){
        a = 11;
        b = 21;
        c = a*b;
        System.out.println("Mul. of two numbers: "+ c);

    }

    void div(){
        a = 200;
        b = 20;
        c = a/b;
        System.out.println("div. of two numbers: "+ c);

    }
}
class C extends B{
    void rem(){

        a = 200;
        b = 21;
        c = a%b;
        System.out.println("Remainder of two numbers: "+ c);

    }
} 

class Test{
    public static void main(String[] args) {
        C r = new C();
        r.add(); r.sub(); r.mult(); r.div(); r.rem();

    }
}
