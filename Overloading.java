// -------Method Overloading-------------

class A{
    void add(){
        int a,b,c;
        a = 10;
        b = 20;
        c = a+b;
        System.out.println(c);

    }

    void add(int x,int y ){

        int c;
        c = x+y;
        System.out.println(c);
        
    }

    void add(int x,double y ){

        double c;
        c = x+y;
        System.out.println(c);
        
    }

    public static void main(String[] args) {
        A r = new A();
        r.add(); r.add(1,2); r.add(5,8.9);
    }
}