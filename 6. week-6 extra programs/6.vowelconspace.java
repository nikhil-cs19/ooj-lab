// Design a Java program to accept a string. Count and display the number of
// vowels, consonants and spaces in the string
import java.util.*;
class vowelconspace{
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String str,str1;
    int vow=0,con=0,spa=0;
    System.out.println("Enter the string");
    str1=in.nextLine();
    str=str1.toLowerCase();
    for (int i=0;i<str.length();i++) {
      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        vow++;
      }
      else if(str.charAt(i)==' '){
        spa++;
      }
      else{
        con++;
      }
    }
    System.out.println("no of vowels       = "+vow);
    System.out.println("no of consonents   = "+con);
    System.out.println("no of white spaces = "+spa);
  }
}
