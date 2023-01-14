

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>


int main()
{
int t;
scanf("%d",&t);
while(t--)
{
long n,k,i,j,f=0,m=0;
long a[100000]={0};
scanf("%ld%ld",&k,&n);
long lim=n/2;
for(i=0;i<=lim;i++)
{
a[i]=i;
}
if(a[i]==n)
{
f=1;
break;
}
for(j=0;j<=lim;j++)
{
if(f==1)
{
break;
}
if(i==j)
{
continue;
}
if(a[i]+a[j]==n)
{
f=1;
break;
}
}
if(f==1)
{
printf("%ld ",n);
for(i=0;i<j;i++)
{
printf("%ld ",a[i]);
}
for(i=j+1;i<=lim;i++)
{
printf("%ld ",a[i]);
}
printf("\n");
}
}
return 0;
}