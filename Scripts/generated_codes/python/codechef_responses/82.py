Time Limit : 10 seconds

Expected complexity : O(N)
*/
#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <string>
#include <cstring>
#include <vector>
#include <map>
#include <list>
#include <stack>
#include <queue>
#include <algorithm>
using namespace std;

#define mod 1000000007
#define inf 2147483647
#define ninf -2147483648
#define FOR(i,a,b) for(i=a;i<b;i++)
#define s(a) scanf("%d",&a)
#define lls(a) scanf("%lld",&a)
#define ss(a) scanf("%s",a)
#define p(a) printf("%d",a)
#define llp(a) printf("%lld",a)
#define sp(a) printf("%s",a)
#define cp(a) printf("%c",a)
#define nline printf("\n")
#define space printf(" ")
#define ll long long

int gcd(int a, int b){
	if(a==0)
		return b;
	return gcd(b%a, a);
}

bool isprime(int n){
	int i;
	if(n==1)
		return false;
	for(i=2;i*i<=n;i++){
		if(n%i==0)
			return false;
	}
	return true;
}

int main(){
	int test, n, i, j, ans;
	s(test);
	while(test--){
		s(n);
		int num[n], den[n], temp[n+1];
		for(i=0;i<n;i++){
			scanf("%d/%d", &num[i], &den[i]);
		}
		temp[n] = num[n-1];
		for(i=n-1;i>=0;i--){
			temp[i] = temp[i+1] + num[i];
		}
		ans = temp[0];
		for(i=1;i<n;i++){
			ans = gcd(ans, temp[i]);
		}
		for(i=0;i<n;i++){
			printf("%d/%d", num[i], den[i]);
			if(i!=n-1)
				space;
		}
		nline;
	}
	return 0;
}