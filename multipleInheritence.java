// --------multiple Inheritance------------

interface A{
    void show();  //public + abstaract
}

interface B{
    void show(); // public + abstaract
}
class Multiple implements A, B{
    public void show(){
        System.out.println("INTERACE A and B");
    }
    public static void main(String[] args){
        Multiple m = new Multiple();
        m.show();
    }
}