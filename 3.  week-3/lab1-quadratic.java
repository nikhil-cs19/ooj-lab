import java.util.*;
public class quadratic {
    public static void main (String args[]){
    Scanner in= new Scanner(System.in);
    double sq,disc,equal,root1=0,root2=0;
    System.out.println("Enter coefficient of x^2: ");
    double a=in.nextDouble();
    System.out.println("Enter coefficient of x: ");
    double b=in.nextDouble();
    System.out.println("Enter constant c: ");
    double c=in.nextDouble();
    disc=(b*b)-(4.0*a*c);
    sq=Math.sqrt(disc);
    if(disc<0.0){
        System.out.println("There are no real solutions");
    }
    else if(disc==0.0){
       equal=-b/(2*a);
       System.out.println("The roots are equal which is "+equal);
    }
    else{
        root1=((-b)+sq)/(2.0*a);
        root2=((-b)-sq)/(2.0*a);
        System.out.println("The roots are "+root1+" and "+root2);
    }
  }
}