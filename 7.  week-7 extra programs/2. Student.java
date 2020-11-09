/*Develop a Java program to create a class Student whose variables are usn, name and sem.
Derive a class Test from Student to include an array of cie marks of each course and their
corresponding credits in another array. Derive a class Exam from Test which includes an
array of see marks. Derive a class Result which calculates the grade for each course and the
SGPA. Create n student objects and displays all the above details.*/
import java.util.*;
class student{
  Scanner in = new Scanner(System.in);
  String usn,name;
  int sem;
  student(){
    System.out.println("Enter student name,usn and sem");
    name=in.nextLine();
    usn=in.next();
    sem=in.nextInt();
  }
}
class test extends student{
  int cie[] =new int[5];
  int totc=0;
  int credits[]=new int[5];

  test(){
  for(int i=0;i<5;i++){
    System.out.println("Enter marks and credits of subject "+(i+1));
    cie[i]=in.nextInt();
    credits[i]=in.nextInt();
    totc+=credits[i];
  }
}
}
class exam extends test{
  int[] see=new int[5];
  exam(){
  for(int i=0;i<5;i++){
    System.out.println("Enter marks of subject"+(i+1));
    see[i]=in.nextInt();
  }
}
}
class result extends exam{
double[] grade=new double[5];
double cal=0;
int[] marks = new int[5];
void SGPA(){
  for(int j=0;j<5;j++){
    marks[j]=cie[j]+((int)see[j]/2);
            if(marks[j]>=90)
                grade[j]=10.0;
            else if(marks[j]>=80 && (marks[j]<90))
                grade[j]=9.0;
            else if(marks[j]>=70 && (marks[j]<80))
                grade[j]=8.0;
            else if(marks[j]>=60 && (marks[j]<70))
                grade[j]=7.0;
            else if(marks[j]>=50 && (marks[j]<60))
                grade[j]=6.0;
            else
                grade[j]=0.0;
    cal+=credits[j]*grade[j];
}
double sgpa=cal/totc;
for(int i=0;i<5;i++){
  System.out.println("Subject"+(i+1)+"grade = "+grade[i]);
}
System.out.println();
System.out.println();
System.out.println("overall SGPA grade = "+sgpa);
}
}
class Stud{
  public static void main(String[] args) {
     result s = new result();
     s.SGPA();
  }
}
