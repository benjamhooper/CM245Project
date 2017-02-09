
package chapter11;

public class Customer {
    private String name;
    private String phone;
    public Customer() { }
    public Customer(String name, String phone) {
        setName(name);
        setPhone(phone);
    }
    /**
     * @return the name
     */
    public double getDiscount() {return 0;}
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String toString(){
        return "Name = " + getName() + 
               "\nPhone = " + getPhone();
    }
    

}
