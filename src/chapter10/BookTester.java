package chapter10;

import java.io.FileNotFoundException;

/**
 *
 * @author hooperbe
 */
public class BookTester {

    public static void main(String[] args)
            throws FileNotFoundException {
        Book myBook = new Book();
        myBook.load();
        System.out.println("My Books title: " + myBook.getTitle());
        System.out.println("My Books Chapters: ");
        Chapter[] chapters = myBook.getChapters();
        for (int i = 0; i < myBook.getNumberOfChapters(); i++) {
            System.out.println(chapters[i].getName() + " - Page Ct: "
                    + chapters[i].getPageCt());
        }

        System.out.println();
        /*
       Book myBook = new Book("VBA for Modlers");
       Chapter chp1 = new Chapter("Intro to VBA", 10);
       Chapter chp2 = new Chapter("The Excel Object Model", 8);
       myBook.add(chp1);
       myBook.add(chp2);
       
    System.out.println("My Books title: "+ myBook.getTitle());
    System.out.println("My Books Chapters: " );
    Chapter[] chapters = myBook.getChapters();
    for (int i = 0; i < myBook.getNumberOfChapters(); i++)
      System.out.println(chapters[i].getName() + "Page Ct; " 
              + chapters[i].getPageCt());

    System.out.println();
    System.out.print("Number of students in course2: "
      + course2.getNumberOfStudents());  

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
    
    System.out.println();
    System.out.print("Number of students in course2: "
      + course2.getNumberOfStudents());
         */
    }
}
