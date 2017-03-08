/**
 * @author Benjamin Hooper
 */
package Lab03;

import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Course {

    private String courseName;
    private ArrayList<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        String[] a = new String[students.size()];
        return students.toArray(a);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public void load() throws FileNotFoundException {
        Scanner in = new Scanner(new File("course.txt"));
        while (in.hasNextLine()) {
            students.add(in.nextLine());
        }
        in.close();
    }
}
