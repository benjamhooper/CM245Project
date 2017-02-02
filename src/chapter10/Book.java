package chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hooperbe
 */
public class Book {

    private String title;
    private Chapter[] chapters;
    public static final int MAX_CHP = 10;
    private int numberOfChapters;
    public static final String DEFUALT_FILE_NAME="bookdata.txt";

    public Book(String title) {
        setTitle(title);
        numberOfChapters = 0;
        chapters = new Chapter[MAX_CHP];
    }
    public void load(String fileName) 
            throws FileNotFoundException 
    {
        Scanner in = new Scanner(new File(fileName));
        int k = 0;
        while (in.hasNext()) {
            k++;
            String rec = in.nextLine();
            if (k == 1) {
                setTitle(rec);
            } else {
                Chapter chp = new Chapter();
                String[] fields = rec.split(",");
                chp.setName(fields[0].trim());
                int count = Integer.parseInt(fields[1].trim());
                chp.setPageCt(count);
                this.add(chp);

            }
        }
        
    }
    public void load() throws FileNotFoundException {
        load(Book.DEFUALT_FILE_NAME);
        /* Scanner in = new Scanner(new File("bookdata.txt"));
        int k = 0;
        while (in.hasNext()) {
            k++;
            String rec = in.nextLine();
            if (k == 1) {
                setTitle(rec);
            } else {
                Chapter chp = new Chapter();
                String[] fields = rec.split(",");
                chp.setName(fields[0].trim());
                int count = Integer.parseInt(fields[1].trim());
                chp.setPageCt(count);
                this.add(chp);

            }
            //System.out.println(rec);
        }*/
    }

    public Book() {
        numberOfChapters = 0;
        chapters = new Chapter[MAX_CHP];
    }

    public void add(Chapter aChapter) {
        if (getNumberOfChapters() < MAX_CHP) {
            chapters[getNumberOfChapters()] = aChapter;
        }
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
