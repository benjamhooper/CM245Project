/**
 * @author Benjamin Hooper
 */
package Lab02;

public class Coin {

    //data
    private String name;
    //value is given in cents
    private double value;

    //Constructors
     public Coin(){
     }
     
     public Coin(String name, double value){
         setName(name);
         setValue(value);
     }
 
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    //methods
    public String toString() {
        return "Name=" + name + ",Value=" + value;
    }
}
