

Explanation:
Test 1: The friends can buy a caravan of cost 10 and then move it to the first road. They will have to pay 6 dollars at the toll booths and have 4 dollars left with them.
Test 2: They don't have enough money to buy a caravan of cost 10.
Test 3: They can buy the caravan of cost 10 and then move it to the first road. They will have to pay 5 dollars at the toll booths and have 5 dollars left with them. Thus a caravan of cost 10 can be bought with no money left in hand.



Solution:

#include <iostream>
#include <bits/stdc++.h>
#include <math.h>
#include <string.h>
#include <algorithm>
#define endl '\n'
#define ll long long int
#define pb push_back
#define mp make_pair
#define foriter(it, x) for (__typeof((x).begin()) it = (x).begin(); it != (x).end(); it++)
using namespace std;
int mod=1000000007;
long long ll_int_max=999999999999;
long long int answer;
//This is a function problem.You only need to complete the function given below
//User function Template for C++

void setVals(vector<vector<long long int>> &dp,long long int x,long long int y,long long int n,long long int m,vector<long long int> &toll,vector<vector<long long int>> &C){
    for(long long int i=0;i<m;i++){
        if(i==x)dp[x][y]=max(dp[x][y],dp[x][(y-1+n)%n]+toll[y]);
        else dp[x][y]=max(dp[x][y],dp[i][(y-1+n)%n]+C[i][x]+toll[y]);
    }
    //cout<<dp[x][y]<<endl;
}

//Complete this function
long long int maxMoney(vector<long long int> toll,vector<vector<long long int>> C,long long int n,long long int m,long long int D){
    //Your code here
    vector<vector<long long int>> dp(m,vector<long long int>(n,0));
    setVals(dp,0,0,n,m,toll,C);
    for(long long int i=1;i<n;i++){
        for(long long int j=0;j<m;j++){
            setVals(dp,j,i,n,m,toll,C);
        }
    }
    for(long long int i=0;i<m;i++){
        //cout<<dp[i][n-1]<<" ";
        if(dp[i][n-1]<=D)answer=max(answer,dp[i][n-1]);
    }
    return answer;
}

int main() {
    #ifndef ONLINE_JUDGE
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    #endif // ONLINE_JUDGE
    ios_base::sync_with_stdio(false);
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    // aashish gahlawat
    int t;
    cin>>t;
    while(t--){
        //int n,m,D;
        long long int n,m,D,toll,C_ij;
        cin>>D>>n>>m;
        vector<long long int> toll(n);
        vector<vector<long long int>> C(m);
        for(long long int i=0;i<n;i++){
            cin>>toll[i];
        }
        for(long long int i=0;i<m;i++){
            C[i].resize(m);
            for(long long int j=0;j<m;j++){
                cin>>C_ij;
                C[i][j]=C_ij;
            }
        }
        answer=0;
        long long int ans=maxMoney(toll,C,n,m,D);
        cout<<ans<<endl;
    }
    return 0;
}