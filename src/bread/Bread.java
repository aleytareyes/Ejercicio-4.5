
package bread;


public class Bread {
    private String breadType;
    private Integer calories;
    public final static String MOTTO = "The Staff Of Life";

    Bread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getbreadType(){
        return breadType;
    }
    public Integer getcalories(){
        return calories;
    }
    public Bread(String type, Integer bcalories){
        this.breadType=type;
        this.calories=bcalories;
    }
}
