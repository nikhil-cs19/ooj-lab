import java.util.*;
public class SumIndices {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a[];
        int sum=0,total=0;
        System.out.println("Enter n: ");
        int n=in.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+i+"]");
            a[i]=in.nextInt();
        }
        for(int k=0;k<n;k=k+2){
            sum=sum+a[k];
        }
        System.out.println("Sum of elements of even indices = "+sum);
        for(int j=1;j<n;j=j+2){
            total=total+a[j];
        }
        System.out.println("Sum of elements of odd indices = "+total);
    }
}