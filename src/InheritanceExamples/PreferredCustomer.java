
package InheritanceExamples;

public class PreferredCustomer extends Customer {
    private double discount;
    public PreferredCustomer() {
        setDiscount(0.1);
        
    }
    public PreferredCustomer(String name, String phone, 
            double discount) {
        super(name,phone);
        setDiscount(discount);
    }
    
    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }
    

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
