
//------------- question 1 answer-------------------------------

class cylinder{
    private int radius;
    private int height;

    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;
    }
         public double surfacearea(){
        return 2* 3.14* radius * radius + 2*3.14*radius*height;
    }
      public double volume(){
        return 3.14* radius * radius *height;
    }
}

public class accessmodifierexersise {
    public static void main(String[] args) {
        cylinder mycylinder = new cylinder();
        mycylinder.setheight(12);
        int h = mycylinder.getheight();
        System.out.println(h);
        mycylinder.setradius(9);
        System.out.println(mycylinder.getradius());
         System.out.println(mycylinder.surfacearea());
         System.out.println(mycylinder.volume());
    }
    
}
