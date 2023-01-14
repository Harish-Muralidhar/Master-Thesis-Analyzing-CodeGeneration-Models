/*

*/

#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
#include <map>
#include <unordered_map>
#include <list>
#include <cmath>
#include <queue>
using namespace std;

#define ll long long int

int main() {
    ll T;
    cin>>T;
    while(T--) {
        ll N,M,K;
        cin>>N>>M>>K;
        vector<ll> dp(M+1,0);
        dp[0]=1;
        vector<ll> dpNew(M+1,0);
        for(ll i=1;i<=K;i++) {
            dpNew[0]=0;
            dpNew[1]=N;
            for(ll j=2;j<=M;j++) {
                dpNew[j]=(dpNew[j-1]*(N-1)/N)+(dpNew[j-2]*(N-1)/N)+(dp[j-1]*(N-1)/N);
                dpNew[j]%=1000000009;
            }
            dp=dpNew;
            // for(auto k:dp)
            //     cout<<k<<" ";
            // cout<<endl;
        }
        cout<<dpNew[M]<<endl;
    }
    return 0;
}