package chapter10;

public class Chapter {
    private String name;
    private int pageCt;
    public Chapter() { }
    public Chapter(String name, int pageCt) {
        setName(name);
        setPageCt(pageCt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCt() {
        return pageCt;
    }

    public void setPageCt(int pageCt) {
        this.pageCt = pageCt;
    }
}
