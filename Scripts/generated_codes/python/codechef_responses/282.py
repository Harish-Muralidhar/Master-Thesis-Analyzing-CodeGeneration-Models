
Note
Time limit: 2 seconds.
Memory limit: 512MB.
*/

#include <iostream>
#include <cmath>

using namespace std;

int main() {
	unsigned long long i, k, s, a, b;
	cin >> i >> k >> s >> a >> b;
	
	double q = (a + b) / pow(2.0, s);
	
	if (i == k) {
		cout << q << endl;
		return 0;
	}
	
	double a_n = a;
	double b_n = b;
	
	if (i < k) {
		for (int j = i + 1; j <= k; j++) {
			a_n = pow(2, 0.5) * a_n + pow(3, 0.5) * b_n;
			b_n = a_n - b_n;
		}
		cout << q * (2.0 / (a_n + b_n)) << endl;
		return 0;
	}
	
	for (int j = i - 1; j >= k; j--) {
		b_n = pow(2, 0.5) * a_n + pow(3, 0.5) * b_n;
		a_n = b_n - a_n;
	}
	cout << q * (2.0 / (a_n + b_n)) << endl;
	
	return 0;
}