// ------Interface Default Methods(JDK)-----

interface A{
    void a1(); //public + abstract
    void a2(); //public + abstract
    // void a3(); // after some day adding this method 

    default void a3(){ //public + default}
        System.out.println("May or May not override in implementing class ");

    }
}
class B implements A{
    public void a1(){
        System.out.println("Class B a1()");

    }

    public void a2(){
        System.out.println("Class B a2()");
        
    }

}
class  C implements A{
    public void a1(){
        System.out.println("Class c a1()");

    }

    public void a2(){
        System.out.println("Class c a2()");
        
    }

}

class  D implements A{
    public void a1(){
        System.out.println("Class  D a1()");

    }

    public void a2(){
        System.out.println("Class D a2()");
        
    }
}
class Main{
    public static void main(String[] args) {
        B b = new B();
        b.a1(); b.a2(); b.a3();

        C c = new C();
        c.a1(); c.a2();c.a3();

        D d = new D();
        d.a1(); d.a2();d.a3();
    }
}