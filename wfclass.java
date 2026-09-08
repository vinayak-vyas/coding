class employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my name is :" + name);
        System.out.println("my id is :" + id);
        
    }
    public int getsalary(){
        return salary;
    }
}

public class wfclass {
        public static void main(String[] args) {
            System.out.println("this is my private class");
            employee harry = new employee();
             employee vinayak = new employee();

             harry.id = 12;
             harry.name = "harry cwh";
             harry.salary = 340000;

             vinayak.id = 23455;
             vinayak.name = "vinayak vyas";
             vinayak.salary = 65000;

        vinayak.printdetails();
        harry.printdetails();
        int salary = vinayak.getsalary();
        System.out.println(salary);

        }
}
