class base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("i am setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("i am constructoer");
    }
}
class Derived extends base{
    int y;

    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}

public class inheritence {
    public static void main(String[] args) {
        base b = new base();
        b.setx(5);
        System.out.println(b.getx());
    }
}
