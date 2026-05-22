#include"stdio.h"
#include"conio.h"
void main()
{
    FILE*fp;
    pf=fopen("ak.txt","w");
    int roll,fee;
    char name[29];

    printf("\nenter roll,fee,name");
    scanf("%d%s%d",&roll,&nme,&fee);

    fprint(fp"%d%s%d",roll name,fee);
    print("\ndata written successfully");
    fclose(fp);
    
}
