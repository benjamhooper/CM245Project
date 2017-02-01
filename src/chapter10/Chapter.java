package chapter10;

public class Chapter {
    private String name;
    private int pageCt;
    public Chapter() { }
    public Chapter(String name, int pageCt) {
        setName(name);
        setPageCt(pageCt);
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

    /**
     * @return the pageCt
     */
    public int getPageCt() {
        return pageCt;
    }

    /**
     * @param pageCt the pageCt to set
     */
    public void setPageCt(int pageCt) {
        this.pageCt = pageCt;
    }
}
