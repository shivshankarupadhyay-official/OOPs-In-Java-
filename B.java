// -----CONSTRUCTOR-----


// A naam ki class create kar rahe hain  
class A {

    // Ye instance variables hain
    int a;
    String name;


    // Ye constructor hai
    // Constructor ka naam class ke naam ke same hota hai
    // Object create hote hi constructor automatically call hota hai
    A() { //default Constructor

        // a ki value 0 set kar rahe hain
        a = 0;

        // name ki value null set kar rahe hain
        // null ka matlab abhi koi String value nahi hai
        name = null;
    }


    // Ye show() method hai
    // void ka matlab method koi value return nahi karega
    void show() {

        // a aur name ki value print karenge
        System.out.print(a + " " + name);
    }
}


// B naam ki doosri class
class B {

    // Program ki execution yahin se start hoti hai
    public static void main(String[] args) {


        // A class ka object create kar rahe hain
        // 'obj' object ka reference hai
        A obj = new A();


        // obj ke through show() method ko call kar rahe hain
        obj.show();
    }
}