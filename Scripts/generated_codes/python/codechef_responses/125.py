
Explanation:
The number of sub rectangles which contains even number of currants are 4, 4, 6, 6, 5, 6, 8, 8, 5, 6, 4, 4, 5, 5, 6, 6, 5, 5, 6, 6, 5, 6, 4, 4, 5, 5, 6.


Explanation
In the first sample you can see that there are 3 sub rectangles which contains even number of currants.
*/
#include<iostream>
using namespace std;
int main()
{
    int n,m,i,j,count=0;
    cin>>n>>m;
    char a[n][m];
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            cin>>a[i][j];
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            if(a[i][j]=='0')
            {
                count++;
            }
            else
            {
                count--;
            }
        }
    }
    cout<<count;
}