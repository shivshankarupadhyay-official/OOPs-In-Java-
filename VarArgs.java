// ----------Var Args Methods----------

class A{
    void add(int ...a){ //var-args Methods
        int sum = 0;
        for(int x;a){
            sum = sum+x;

        }
        System.out.println("Sum = "+sum);
    }


}
class Demo{
    public static void main(String[] args){
        A r = new A();
        r.add(); r.add(10); r.add(10,20);
        r.add(10,20,30); r.add(10,20,30,40);

    }
}