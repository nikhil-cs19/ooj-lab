import java.util.*;
class father{
  Scanner in = new Scanner(System.in);
  int fage;
  father() throws ArithmeticException
  {
    System.out.println("Enter fathers age");
    fage=in.nextInt();
    try{
      if(fage<0){
        throw new ArithmeticException();
      }
    }
    catch (ArithmeticException e) {
      System.out.println("Age of the father is less than 0");
    }
  }
}
class son extends father{
  int sage;
  son() throws ArithmeticException
  {
    System.out.println("Enter son age");
    sage=in.nextInt();
    try{
      if(sage>=fage){
        throw new ArithmeticException();
      }
    }
    catch (ArithmeticException e){
      System.out.println("son age is more than father age");
    }
  }
}
class exceptionMain{
  public static void main(String[] args) {
    son s = new son();
  }
}
