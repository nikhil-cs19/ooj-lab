#include<stdio.h>
#include<string.h>
struct Student{
    char name[20];
    int choice;
}s[100];

void main(){
    int i, n, j, k, l, m, p, q, r, t, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
    printf("enter no of students:\n");
    scanf("%d",&n);
    for(i = 0; i < n; i++){
        printf("enter first name:\n");
        scanf("%s",&s[i].name);
        printf("select ur preferred elective:\n");
        printf("1-IOT\t2-Advanced Java\t3-J2EE\t4-Advanced DS\n");
        scanf("%d",&s[i].choice);
    }
    printf("Students enrolled in IOT:\n");
    for (j = 0; j < n; j++){
        if(s[j].choice == 1){
            printf("%s",s[j].name);

            c1++;
        }
    }
    printf("No of students enroller in IOT: %d\n\n",c1);
    if (c1 < 5){
        printf("This course will not be streamed as total count is less than 30\n");
        for (p = 0; p < n; p++)
        {
            if (s[p].choice == 1)
            {
                printf("Please select other electives:\n");
                printf("Choose available electives\n");
                scanf("%d",&s[p].choice);
                }
        }
    }
    printf("Students enrolled in Advanced Java:\n");
    for (k = 0; k < n; k++)
    {
        if (s[k].choice == 2)
        {
            printf("%s",s[k].name);
            c2++;
        }
    }
    printf("No of students enroller in Advanced Java: %d\n\n", c2);
    if (c2 < 5)
    {
        printf("This course will not be streamed as total count is less than 30\n");
        for (q = 0; q < n; q++)
        {
            if (s[q].choice == 2)
            {
                printf("Please select other electives:\n");
                printf("Choose available electives\n");
                scanf("%d", &s[q].choice);
            }
        }
    }
    printf("Students enrolled in J2EE:\n");
    for (l = 0; l < n; l++)
    {
        if (s[l].choice == 3)
        {
            printf("%s",s[l].name);
            c3++;
        }
    }
    printf("No of students enroller in J2EE: %d\n\n", c3);
    printf("Students enrolled in Advanced DS:\n");
    if (c3 < 5)
    {
        printf("This course will not be streamed as total count is less than 30\n");
        for (r = 0; r < n; r++)
        {
            if (s[r].choice == 3)
            {
                printf("Please select other electives:\n");
                printf("Choose available electives  \n");
                scanf("%d", &s[r].choice);
            }
        }
    }
    for (m = 0; m < n; m++)
    {
        if (s[m].choice == 4)
        {
            printf("%s",s[m].name);
            c4++;
        }
    }
    printf("No of students enroller in Advanced DS: %d\n\n", c4);
    if (c4 < 5)
    {
        printf("This course will not be streamed as total count is less than 30\n");
        for (t = 0; t < n; t++)
        {
            if (s[t].choice == 4)
            {
                printf("Please select other electives:\n");
                printf("Choose available electives\n");
                scanf("%d", &s[t].choice);
            }
        }
    }
}
