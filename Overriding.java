class Shape{
    void draw(){
        System.out.println("Cant Say shape Type");

    }
}

class square extends Shape{

    @Override 
    void draw(){
        System.out.println("Square shape");
    }
}class S{
    public static void main(String[] args) {
        Shape r = new square();
        r.draw();
    }
}
