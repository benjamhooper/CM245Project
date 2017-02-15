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
     
    Coin(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    //methods
    public String toString() {
        return "Name=" + name + ",Value=" + value;
    }

    void getValue(double coinValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getName(String coinName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
