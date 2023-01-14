03896

Sample Input 4
100 100 100 100 100

Sample Output 4
1.0

*/
#include <bits/stdc++.h>
using namespace std;
int main()
{
    //Your code goes here
    int va, vb, sa, sb, ma;
    cin >> va >> vb >> sa >> sb >> ma;
    double s = 1.0 * sa / (sa + sb);  // Probability of getting s from the uniform distribution
    double t = 1.0 * sb / (sa + sb);  // Probability of getting t from the uniform distribution
    double p = 1.0;                   // Probability of a win
    double q = 1.0;                   // Probability of a loss
    for (int i = 0; i <= ma; i++)
    {
        p *= t;  // Probability of a win after i uses of skill
        if (va <= 2 * sb)
        {
            p += q * s;
        }
        q *= s;  // Probability of a loss after i uses of skill
    }
    cout << fixed << setprecision(10) << p;
    return 0;
}