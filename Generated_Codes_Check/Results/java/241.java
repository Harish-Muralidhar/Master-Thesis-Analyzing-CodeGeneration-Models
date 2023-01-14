/*

*/


#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long int
#define F first
#define S second
#define PB push_back
#define MP make_pair
#define EB emplace_back
#define rep(i, a, b) for(int i=a;i<=b;i++)
#define debug(x) cout << '>' << #x << ':' << x << endl;
#define SQ(a) (a)*(a)
#define nl "\n"
#define INF std::numeric_limits<int>::max()
#define MOD 1000000007

typedef tree<int,null_type,less<int>,rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

//double index(int x, int y){
//    return double(x-1)*double(n) + double(y);
//}

//bool sortbysec(const pair<int,int> &a,const pair<int,int> &b){
//    return (a.second < b.second);
//}

//priority_queue<int,std::vector<int>,greater<int> > minHeap;

//bool sortbysecdesc(const pair<int,int> &a,const pair<int,int> &b){
//    return a.second>b.second;
//}

/*
1
3
2 6 4
4 8 9
7 9 4
*/

vector<bool> visited;
vector<bool> prime;
vector<int> pass;
vector<int> dis;
vector<int> v;

void seive(int n){
    visited.assign(n+1,false);
    prime.assign(n+1,true);
    dis.assign(n+1,0);
    pass.assign(n+1,0);
    rep(i,2,n){
        if (!visited[i]){
            for (int j = i+i; j <= n; j+=i){
                prime[j] = false;
            }
        }
    }
}

void solve(){
    int n, x;
    cin>>n;
    seive(100000000);
    rep(i,1,n){
        rep(j,1,n){
            cin>>x;
            pass[x] = 1;
        }
    }
    int count = 0;
    rep(i,1,100000000){
        if (pass[i]){
            if (prime[i]){
                rep(j,2,i){
                    if (prime[j] && j<i){
                        dis[i] += 1;
                    }
                }
            }
            else if (i%2 == 0){
                dis[i] = dis[i-1] + 1;
            }
            else{
                dis[i] = dis[i-1] + 1;
                int n = i;
                rep(j,0,n){
                    if (prime[j] && j<i){
                        dis[i]++;
                    }
                }
            }
        }
        count += dis[i];
    }
    cout<<count<<nl;
}

int main()
{
//    ios::sync_with_stdio(false);
//    cin.tie(0);
//    cout.tie(0);
    int t = 1;
    cin>>t;
    for(int i = 1; i <= t; i++){
        // cout<<"Case #"<<i<<": ";
        solve();
    }
    return 0;
}