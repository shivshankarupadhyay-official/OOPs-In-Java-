// --------SUPER KEYWORD------

class A{
    int a = 10;
    void show(){
        System.out.println("HELLO VIEWERS");
    }


}// super classes

class B extends A{ // Subclass

    int a =20;
    void show(){
        super.show();
        System.out.println("HELLO INDIANS");
        System.out.println(super.a);  //Super keyword
    } 

 
}

class Test{
    public static void main(String[] args){
        B r = new B();
        r.show();
    }
}