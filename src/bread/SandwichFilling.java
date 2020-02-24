/*Create a class named SandwichFilling. Include a field for the filling type (such as
“egg salad”) and another for the calories in a serving. Include a constructor that
takes parameters for each field, and include get methods that return the values of
the fields. Write an application named TestSandwichFilling to instantiate three
SandwichFilling objects with different values, and then display all the data for
each object. Save both the SandwichFilling.java and TestSandwichFilling.java
files.*/
package bread;


public class SandwichFilling {
    private String fillingType;
    private Integer fCalories;

    public SandwichFilling(String fillingType, Integer fCalories) {
        this.fillingType = fillingType;
        this.fCalories = fCalories;
    }

    public String getFillingType() {
        return fillingType;
    }

    public Integer getfCalories() {
        return fCalories;
    }
    
    
}
