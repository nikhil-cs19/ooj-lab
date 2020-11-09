import java.util.*;
public class SuperMarketBill {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double discount=0,bill=0,total=0,rate[];
        int quantity[];
        System.out.println("Enter no of items");
        int x=in.nextInt();
        rate = new double[x];
        quantity= new int[x];
        for(int i=0;i<x;i++){
            System.out.println("Enter cost of item"+(i+1));
            rate[i]=in.nextDouble();
            System.out.println("Enter quantity of item"+(i+1));
            quantity[i]=in.nextInt();
            total+=(rate[i]*quantity[i]);
        }
        if(total>=10000){
            discount=(5.0*total)/100.0;
            bill=total-discount;
        }
        else if(total>=7500 && total<10000){
            discount=(3.0*total)/100.0;
            bill=total-discount;
        }
        else if(total>=5000){
            discount=(2.0*total)/100.0;
            bill=total-discount;
        }
        System.out.println("Total Amount = "+total);
        System.out.println("Discount = "+discount);
        System.out.println("Final Bill Amount = "+bill);
    }
}