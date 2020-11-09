import java.util.*;
public class EvenOperations {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a[],b[],c[];
        int odd=0,even=0;
        int os=0,es=0,sum=0,avg,max=0,min=0;
        System.out.println("Enter n: ");
        int n=in.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+i+"]");
            a[i]=in.nextInt();
        }
        for(int j=0;j<n;j++){
            if((a[j]%2)==0)
            even++;
            else
            odd++;
        }
        b=new int[odd];
        c=new int[even];
        for(int k=0;k<n;k++){
            if((a[k]%2)==0){
                c[es++]=a[k];
            }
            else {
                b[os++]=a[k];
            }
        }
        max=c[0];
        min=c[0];
        for(int l=0;l<even;l++){
           sum+=c[l];
           if(c[l]>max){
               max=c[l];
           }
           if(c[l]<min){
               min=c[l];
           }
        }
        avg=(sum/even);
        System.out.println("sum of even numbers is "+sum);
        System.out.println("average of even numbers is "+avg);
        System.out.println("maximum of even numbers is "+max);
        System.out.println("minimum of even numbers is "+min);
    }
}