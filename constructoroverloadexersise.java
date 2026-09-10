class rectangle{
    private int length;
    private int breadth;


    public rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public  void rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
}
public class constructoroverloadexersise {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());
    }
}
