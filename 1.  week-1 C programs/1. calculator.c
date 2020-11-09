#include<stdio.h>
int main()
{
    int ch,a,b;
    printf("Enter a number, 0 to exit and any other number to continue\n");
    scanf("%d",&ch);
    while(ch!=0)
    {
        printf("Enter any 2 numbers\n");
        scanf("%d%d",&a,&b);
        switch(ch)
        {
            case 1:
            {
                printf("Sum = %d",(a+b));
                break;
            }
            case 2:
            {
                printf("Difference = %d",(a-b));
                break;
            }
            case 3:
            {
                printf("Product = %d",(a*b));
                break;
            }
            case 4:
            {
                printf("Quotient = %d",(a/b));
                break;
            }
            case 5:
            {
                printf("first > second := %d",(a>b));
                break;
            }
            case 6:
            {
                printf("first < second := %d",(a<b));
                break;
            }
            case 7:
            {
                printf("first = second := %d",(a==b));
                break;
            }
            case 8:
            {
                printf("first is not equal to second = %d",(a!=b));
                break;
            }
            case 9:
            {
                printf("Remainder = %d",(a%b));
                break;
            }
            case 10:
            {
                printf("first <= second := %d",(a<=b));
                break;
            }
            default:
            printf("Wrong choice!");

        }
        printf("\nEnter any number to continue or 0 to exit\n");
        scanf("%d",&ch);
    }
}
