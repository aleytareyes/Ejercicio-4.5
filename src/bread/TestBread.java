
package bread;


public class TestBread {

    
    public static void main(String[] args) {
        Bread p1=new Bread("Integral", 80);
        Bread p2=new Bread("Blanco", 120);
        Bread p3=new Bread("Bollo", 60);
        
        System.out.println(Bread.MOTTO);
        System.out.println("Bread p1 Bread Type: " + p1.getbreadType());
        System.out.println("Bread p1 Bread Calories: " + p1.getcalories());
        System.out.println("Bread p2 Bread Type: " + p2.getbreadType());
        System.out.println("Bread p2 Bread Calories: " + p2.getcalories());
        System.out.println("Bread p3 Bread Type: " + p3.getbreadType());
        System.out.println("Bread p3 Bread Calories: " + p3.getcalories());
        
    }
    
}
