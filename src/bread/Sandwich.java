/*Create a class named Sandwich. Include a Bread field and a SandwichFilling
field. Include a constructor that takes parameters for each field needed in the two
objects and assigns them to each object’s constructor.Write an application
named TestSandwich to instantiate three Sandwich objects with different values,
and then display all the data for each object, including the total calories in a
Sandwich, assuming that each Sandwich is made using two slices of Bread. Save
both the Sandwich.java and TestSandwich.java files.*/
package bread;


public class Sandwich {
  private Bread bread;
  private SandwichFilling sandwich; 

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public SandwichFilling getSandwich() {
        return sandwich;
    }

    public void setSandwich(SandwichFilling sandwich) {
        this.sandwich = sandwich;
    }
  
    public Sandwich(String type, int calories, String fill, int calori){
    bread = new Bread(type, calories);
    sandwich = new SandwichFilling(fill, calori); 
 }
}
