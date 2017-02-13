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
     public Coin(String name, double value) {
        setName("PENNY");
        setValue(0.01);
        setName("NICKEL");
        setValue(0.05);
        setName("DIME");
        setValue(0.10);
        setName("QUARTER");
        setValue(0.25);
    }

    Coin(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*Coin(String name) {
        switch (name) {
            case "dollar":
                setValue(100);
                break;
            case "half dollar":
                setValue(50);
                break;
            case "quarter":
                setValue(25);
                break;
            case "dime":
                setValue(10);
                break;
            case "nickel":
                setValue(5);
                break;
            case "penny":
                setValue(1);
                break;
            default:
                setValue(0);
                System.out.print("invalid coin: " + name + "\n");
                break;
        }
        setName(name);
    }
*/
    //get:set
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
}
