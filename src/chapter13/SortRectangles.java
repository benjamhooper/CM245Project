package chapter13;

import java.util.ArrayList;

public class SortRectangles {
  public static void main(String[] args) {
    ComparableRectangle[] rectangles = {
      new ComparableRectangle(3.4, 5.4), 
      new ComparableRectangle(13.24, 55.4),
      new ComparableRectangle(7.4, 35.4),
      new ComparableRectangle(1.4, 25.4)};
    ArrayList<ComparableRectangle> list = new ArrayList<>();
    list.add(rectangles[0]);
    list.add(rectangles[1]);
    list.add(rectangles[2]);
    list.add(rectangles[3]);
    
    java.util.Arrays.sort(rectangles);
    for (Rectangle rectangle: rectangles) {
      System.out.print(rectangle + " "); 
      System.out.println();
    
    }
    System.out.println("----------------");
   java.util.Collections.sort(list);
   for (Rectangle rectangle: rectangles) {
      System.out.print(rectangle + " "); 
      System.out.println();
   }
  }
}
