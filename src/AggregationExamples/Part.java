package AggregationExamples;

public class Part {

    private int num;
    private String name;

    public Part() {
    }

    public Part(int num, String name) {
        setName(name);
        setNum(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
