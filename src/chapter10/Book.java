
package chapter10;

/**
 *
 * @author hooperbe
 */
public class Book {
    private String title;
    private Chapter[] chapters;
    public static final int MAX_CHP = 10;
    private int numberOfChapters;
    public Book(String title) {
        this.title = title;
        chapters = new Chapter[MAX_CHP];
    }
    
public void add(Chapter aChapter){
     if (getNumberOfChapters() < MAX_CHP)
         chapters[getNumberOfChapters()] = aChapter;
     numberOfChapters++;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the chapters
     */
    public Chapter[] getChapters() {
        return chapters;
    }

    /**
     * @param chapters the chapters to set
     */
    public void setChapters(Chapter[] chapters) {
        this.chapters = chapters;
    }

    /**
     * @return the numberOfChapters
     */
    public int getNumberOfChapters() {
        return numberOfChapters;
    }
    
}
