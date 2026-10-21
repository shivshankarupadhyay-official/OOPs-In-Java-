// -------This keywords------
// class A{

//     void show(){
//         System.out.println(this);


//     }
//     public static void main(String[] args) {
//         A r = new A();
//         System.out.println(r);
//         r.show();
//     }
// }

// Instance and Local variables called
// class A{

//     int a;
//     A(int a){
//         this.a = a;   
//     }

//     void show(){
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         A r = new A(100);
//         r.show();
//     }
// }


// its Automatically recalled Default constructor

class A{

    
    A(){
        System.out.println("Learn coding");
    }

    A(int a){
        this();
    
        System.out.println(a);
    }

    public static void main(String[] args) {
        A r = new A(100);
        
    }
}