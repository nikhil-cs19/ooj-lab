import java.util.*;
class book{
public String bookid,booktitle,author,publisher;
public double price;
public int no_of_pages,year_of_pub;
//Accepting the book details
void AcceptBookDetails(){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter bookid,booktitle,author and publisher of book");
  bookid=in.next();
  booktitle=in.next();
  author=in.next();
  publisher=in.next();
  System.out.println("Enter no_of_pages,year_of_pub and price");
  no_of_pages=in.nextInt();
  year_of_pub=in.nextInt();
  price = in.nextDouble();
}
//Displaying the book details
void DisplayBookDetails(){
  System.out.println(bookid+" :"+booktitle+" : "+author+" : "+publisher+" : "+year_of_pub+" : "+no_of_pages+" : "+price);
}
}
class AboutBook{
   public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   int c=0;
   book[] b = new book[3];
   for(int i=0;i<3;i++){
     b[i] = new book();
     b[i].AcceptBookDetails();
   }
   for(int i=0;i<3;i++){
     b[i].DisplayBookDetails();
   }
   System.out.println("Enter author name");
   String aut=in.next();
   for(int i=0;i<3;i++){
     if(b[i].author==aut){
       b[i].DisplayBookDetails();
     }
   }
   double pric=b[0].price;
   for(int i=0;i<3;i++){
     if(b[i].price>pric)
     pric=b[i].price;
   }
   System.out.println("The most expensive price of book is "+pric);
   for(int i=0;i<3;i++){
     if(b[i].year_of_pub==2020)
     c++;
   }
   System.out.println("no of books published in year 2020 = "+c);
   int page = b[0].no_of_pages;
   for(int i=0;i<3;i++){
     if(b[i].no_of_pages<page)
     page=b[i].no_of_pages;
   }
   System.out.println("no of pages in the book with least number of pages is "+page);
  }
}
