package AggregationWithArrayList;

/**
 *
 * @author zzschmid
 */
public class Part {

    private int num;
    private String name;
    public Part() { }
    public Part(int num, String name) {
        setName(name);
        setNum(num);
    }
    
    public boolean equals(Object o) {
        if (o instanceof Part) {
            Part otherPart = (Part)o;
            return this.getName().equals(otherPart.getName());  
        } 
        return false;
    }
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
