import java.util.*;
public class PosNegZeros {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a[];
        int pos=0,zeros=0,neg=0;
        System.out.println("Enter n: ");
        int n=in.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+i+"]");
            a[i]=in.nextInt();
        }
        for(int k=0;k<n;k++){
            if(a[k]==0)
            zeros++;
            else if(a[k]>0) 
            pos++;
            else
            neg++;
        }
        System.out.println("No of zeros= "+zeros);
        System.out.println("No of positive numbers= "+pos);
        System.out.println("No of negative numbers= "+neg);
    }
}