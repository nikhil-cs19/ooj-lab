/*Develop a Java program to accept the values of a double array through command line.
Display the sorted array.*/
import java.util.*;
class cmdsort{
  public static void main(String[] args) {
    double sort[]=new double[args.length];
    for(int i=0;i<args.length;i++){
      sort[i]=Double.parseDouble(args[i]);
    }
    Arrays.sort(sort);
    System.out.println("elements after sorting");
    for(int i=0;i<args.length;i++){
      System.out.println(sort[i]);
    }
  }
}
