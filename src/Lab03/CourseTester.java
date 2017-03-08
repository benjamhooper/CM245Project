/**
 * @author Benjamin Hooper
 */
package Lab03;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class CourseTester {

    public static void main(String[] args)
            throws FileNotFoundException {
        Course course = new Course("CM111 Intro to Structured Programming");
        course.load();

        System.out.println("Course Name: " + course.getCourseName());

        String[] students = course.getStudents();
        for (int i = 1; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
        System.out.println("Number of students in course: "
                + course.getNumberOfStudents());

        course.dropStudent("Porky Pig");

        System.out.println("Number of students in course: "
                + course.getNumberOfStudents());

        course.addStudent("Ben Hooper");
        course.addStudent("Karen Smith");

        System.out.println("Number of students in course: "
                + course.getNumberOfStudents());
        System.out.print(Arrays.toString(course.getStudents()));

    }
}
