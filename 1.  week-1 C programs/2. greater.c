#include <stdio.h>
float sumaver(int x,int y)
    {
        printf("Sum: %d\n",x+y);
        return((x+y)/2.0);
    }

    void printeven(int x,int y)
    {
        printf("All the even numbers from %d to %d\n",y,x);
        if(y%2 != 0)
            y=y+1;

        for(int i=y;i<=x;i+=2)
             printf("%d ",i);

    }


int main()
{
    int a[3],g1,g2,t;
    printf("Enter the three numbers\n");
    scanf("%d%d%d",&a[0],&a[1],&a[2]);
    for(int i=0;i<3;i++)
    {
    for(int j=i+1;j<3;j++)
    {
        if(a[i]<a[j])
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
    }
    }

    g1=a[0];
    g2=a[1];
    float aver=sumaver(g1,g2);
    printf("Average: %f\n",aver);
    printeven(g1,g2);
     return 0;
}
