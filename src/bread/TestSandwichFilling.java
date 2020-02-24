
package bread;


public class TestSandwichFilling {

   
    public static void main(String[] args) {
        SandwichFilling p1 = new SandwichFilling("Pollo", 123);
        SandwichFilling p2 = new SandwichFilling("Milanesa", 456);
        SandwichFilling p3 = new SandwichFilling("Enchilada", 550);
        System.out.println("Sandwich Filling p1: " + p1.getFillingType());
        System.out.println("Sandwich Calories p1: " + p1.getfCalories());
        System.out.println("Sandwich Filling p2: " + p2.getFillingType());
        System.out.println("Sandwich Calories p2 " + p2.getfCalories());
        System.out.println("Sandwich Filling p3: " + p3.getFillingType());
        System.out.println("Sandwich Calories p3: " + p3.getfCalories());

    }
    
}
