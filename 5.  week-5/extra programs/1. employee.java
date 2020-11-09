import java.util.*;
class emp{
  String empname,empid;
  int empnohrs;
  double empbasic,empgross,emphra,empit,empda;
  void AcceptDetails(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter employee name,employee id");
    empname=in.next();
    empid=in.next();
    System.out.println("Enter empbasic");
    empbasic=in.nextDouble();
    System.out.println("Enter total number of hours employee worked");
    empnohrs=in.nextInt();
    System.out.println("Enter emphra,empda,empit in percentage");
    emphra=in.nextDouble();
    empda=in.nextDouble();
    empit=in.nextDouble();
  }
  void CalculateGross(){
    empgross=(empbasic+(empbasic*emphra)+(empbasic*empda)-(empbasic*empit));
    System.out.println("Employee gross salery = "+empgross);
  }
  void OverTime(){
    if(empnohrs>200){
      double additional;
      additional=(empnohrs-200)*100;
      empgross+=additional;
      System.out.println("Employee additional saalery = "+additional);
      System.out.println("Emloyee total salery = "+empgross);
    }
  }
  void Undertime(){
    if(empnohrs<200){
      double less;
      less=(200-empnohrs)*100;
      empgross+=less;
      System.out.println("reduced employee salery= "+less);
      System.out.println("Emloyee total salery = "+empgross);
    }
  }
}
class employee{
  public static void main(String[] args) {
    emp e1 = new emp();
    e1.AcceptDetails();
    e1.CalculateGross();
    e1.OverTime();
    e1.Undertime();
  }
}
