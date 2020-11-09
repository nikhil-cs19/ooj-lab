#include<stdio.h>
#include<math.h>
int main(){
int choice=1;
float r,h,V,pi=3.14;
double l,A;
while(choice!=0){
    printf("Enter 0 to exit,choice\n1:cylinder\n2:cone\n3:sphere\n");
    scanf("%d",&choice);
    switch(choice){
       case 1:{
           printf("Enter radius,height of cylinder\n");
           scanf("%f%f",&r,&h);
           A=(2*pi*r*h)+(2*pi*r*r);
           V=pi*r*r*2;
           printf("Area of cylinder=%lf\n",A);
           printf("Volume of cylinder=%f\n",V);
           break;
         }
           case 2:{
           printf("Enter radius,height of cone\n");
           scanf("%f%f",&r,&h);
           l=sqrt(h*h + r*r);
           A=pi*r*(r+l);
           V=(pi*r*r*h)/3;
           printf("Area of cone=%lf\n",A);
           printf("Volume of cone=%f\n",V);
           break;
         }
         case 3:{
           printf("Enter radius of sphere\n");
           scanf("%f",&r);
           A=4*pi*r*r;
           V=(4/3)*pi*r*r*r;
           printf("Area of sphere=%lf\n",A);
           printf("Volume of sphere=%f\n",V);
           break;
         }
         case 0:
            {
                printf("Terminating the program");
                break;
            }
         default: {
         printf("wrong choice\n");
         break;
         }
    }
}
}
