*/
#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int main()
{
	int t,i,j;
	scanf("%d",&t);
	float a[t],b[t],c[t];
	for(i=0;i<t;i++)
	{
		scanf("%f%f%f",&a[i],&b[i],&c[i]);
	}
	for(j=0;j<t;j++)
	{
		printf("%.3f\n",sqrt(c[j]*c[j]-(a[j]-b[j])*(a[j]-b[j])));
	}
	return 0;
}