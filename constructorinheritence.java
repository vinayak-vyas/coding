
class base1{
    base1(){
        System.out.println("this is constructor");
    }
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x = x;
    }}
    class derived1 extends base1{
    derived1(){
            System.out.println("i am derived class constructor");
        }
        public int y ;
        public int gety(){
            return y;
        }
        public void sety(int y){
            this.y = y;
        }
    }
public class constructorinheritence {
    public static void main(String[] args) {
        base1 b = new base1();
        b.setx(45);
        System.out.println(b.getx());

        derived1 d = new derived1();
        d.sety(56);
        System.out.println(d.gety());
    }
}
