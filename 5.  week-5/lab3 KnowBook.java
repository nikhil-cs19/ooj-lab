import java.util.*;
class book{
public String booktitle,author;
public double price;
public int no_of_pages;
public book(){
  author="chetan";
  price=300;
  no_of_pages=150;
}
public book(String booktitle,String author,double price,int no_of_pages){
  this.booktitle=booktitle;
  this.author=author;
  this.price=price;
  this.no_of_pages=no_of_pages;
}
public String toString(){
  return(booktitle+" : "+author+" : "+price+" : "+no_of_pages);
}
void GetDetails(){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter booktitle, author, no_of_pages and price");
  booktitle=in.next();
  author=in.next();
  no_of_pages=in.nextInt();
  price = in.nextDouble();
}
void SetDeatils(){
  System.out.println("Book Title :"+booktitle);
  System.out.println("Author     :"+author);
  System.out.println("No of pages:"+no_of_pages);
  System.out.println("Price      :"+price);
}
}
class KnowBook{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    System.out.println("Enter no of books");
    n=in.nextInt();
    book[] b = new book[n];
    for(int i=0;i<n;i++){
      b[i]=new book();
      b[i].GetDetails();
    }
    System.out.println();
    for(int i=0;i<n;i++){
      System.out.println("Details of book "+(i+1));
      System.out.println(b[i]);
      System.out.println();
    }
    /*for(int i=0;i<n;i++){
      b[i].SetDeatils();
      System.out.println();
    }*/
  }
}
