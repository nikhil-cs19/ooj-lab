/*Create a class Age which has the members – years and months. Collect the age of two
people (Choose their names yourself) (create two age objects) and find who is the
elder of the two people.*/
import java.util.*;
class age{
  int years,months;
  void get(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter age years,months");
    years=in.nextInt();
    months=in.nextInt();
  }
}
class ElderAge{
  public static void main(String[] args) {
    int tota,totb;
    age a = new age();
    age b= new age();
    a.get();
    b.get();
    tota=(a.years*12)+a.months;
    totb=(b.years*12)+b.months;
    if(tota>totb){
      System.out.println("person with age "+a.years+" years "+a.months+" months is elder");
    }
    else{
      System.out.println("person with age "+b.years+" years "+b.months+" months is elder");

    }
  }
}
