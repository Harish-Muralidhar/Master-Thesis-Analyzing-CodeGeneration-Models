5 to ensure that the constraints are within the 32-bit integer range.

Time Limit: 1 second(s)

*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
	long long n,k,q,a,b,c,d,e,f,r,s,t,m,A[1000001],L1,La,Lc,Lm,D1,Da,Dc,Dm,sum=0,prod=1,L,R,min,i,j;
	scanf("%lld%lld%lld",&n,&k,&q);
	scanf("%lld%lld%lld%lld%lld%lld%lld%lld%lld%lld%lld",&a,&b,&c,&d,&e,&f,&r,&s,&t,&m,&A[1]);
	scanf("%lld%lld%lld%lld%lld%lld%lld%lld",&L1,&La,&Lc,&Lm,&D1,&Da,&Dc,&Dm);
	for(i=2;i<=n;i++)
	{
		if(pow(t,i)%s<=r)
		{
			A[i]=((a*pow(A[i-1],2))+b*A[i-1]+c)%m;
		}
		else
		{
			A[i]=((d*pow(A[i-1],2))+e*A[i-1]+f)%m;
		}
	}
	for(i=1;i<=q;i++)
	{
		L1=((La*L1)+Lc)%Lm;
		D1=((Da*D1)+Dc)%Dm;
		L=L1+1;
		R=L+k-1+D1;
		min=A[L];
		for(j=L+1;j<=R;j++)
		{
			if(A[j]<min)
				min=A[j];
		}
		sum+=min;
		prod*=min;
	}
	printf("%lld %lld",sum,prod);
	return 0;
}