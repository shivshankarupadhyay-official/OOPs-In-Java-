class A{
    A Show(){
        System.out.println("A Show");
        return this;  // this -----> new -A()
    }
}
class B extends A{
    @Override
    B Show(){
        super.Show();
        System.out.println("B Show");
                return this;

    }
}
class Test{
    public static void main(String[] args){
        B b = new B();
        b.Show();
    }
}