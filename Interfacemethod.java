interface Client{
    void webdesign();
    void webdevelope();

}
abstract class RajTech implements Client
{
    @Override 
    public void webdesign(){

        System.out.println("Green,top menu,three dot button");
    }

}
class RahulTech  extends RajTech
{
    @Override 
    public void webdevelope(){

        System.out.println("HTML,CSS,JAVASCRIPTS");
    }

}


class Check{
    public static void main(String[] args) {
        RahulTech r = new RahulTech();
        r.webdesign();
        r.webdevelope();
    }
}