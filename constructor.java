class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){
        id = 3466;
        name = "my name is vinayak";
    }
    public String getname() {return name;}
    public void setname(String n) { this.name = n;}
    public void setId(int i ) { this.id = i;}
    public int getId() { return id;}
}
public class constructor {
    public static void main(String[] args) {
        MyEmployee vinayak = new MyEmployee();

       // vinayak.setname("vinayak vyas");
       System.out.println(vinayak.getname());  
        System.out.println(vinayak.getId());
    }
}
