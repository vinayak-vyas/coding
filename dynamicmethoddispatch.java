class phone{
    public void on(){
        System.out.println("turning on phone!");
    }
    public void greet(){
        System.out.println("good morning");
    }
}
class smartphone extends phone{
    public void on(){
        System.out.println("turning on smartphone!");
    }
    public void swagat(){
        System.out.println("swagat hai");
    }
}

public class dynamicmethoddispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.greet();
        obj.on();
       // obj.swagat(); -- not allowed
    }
}
