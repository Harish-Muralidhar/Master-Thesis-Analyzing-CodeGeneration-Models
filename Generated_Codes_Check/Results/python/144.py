Now, let's talk about the problem. 
You need to find the number of inversions for each question as quickly as possible. 

This problem is a classic example of a segment tree, which is a data structure for implementation of range queries. 
In our case, the query is "how many inversions are there", and the range is from i to j.

*/
#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define fori(s,e) for(long long i=s;i<=e;i++)
#define forj(s,e) for(long long j=s;j<=e;j++)
#define fork(s,e) for(long long k=s;k<=e;k++)
#define pb push_back
#define mp make_pair
#define deb(x) cout << "#" << x << endl
#define debug(x) cout << "!" << x << endl
#define INF (ll)(1e9+7)
#define mod 1000000007
#define F first
#define S second
#define pi 3.14159265358979323846264338
#define MAXN (ll)(1e6+5)
#define maxc(a,b) ((a>b)?a:b)
#define minc(a,b) ((a<b)?a:b)
#define fast ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define all(a) a.begin(),a.end()
#define scll(t) scanf("%lld",&t)
#define scll2(a,b) scanf("%lld%lld",&a,&b)
#define scll3(a,b,c) scanf("%lld%lld%lld",&a,&b,&c)
#define scll4(a,b,c,d) scanf("%lld%lld%lld%lld",&a,&b,&c,&d)
#define scstr(l) scanf("%[^\n]",l)
#define rep(i, begin, end) for (__typeof(end) i = (begin) - ((begin) > (end)); i != (end) - ((begin) > (end)); i += 1 - 2 * ((begin) > (end)))
#define PI 3.14159265358979323846
#define MAXN 100005
#define pb push_back
int main()
{
    fast;
    ll n,m;
    cin>>n>>m;
    ll a[n+1];
    fori(1,n)
    cin>>a[i];
    ll st[4*n+1];
    fori(0,4*n)
    st[i]=0;
    //build(1,1,n,a,st);
    fori(1,m)
    {
        ll l,r;
        cin>>l>>r;
        update(1,1,n,st,l,r,a);
    }
    return 0;
}