#include <iostream>

using namespace std;

int main(){
	int n;
	int sum = 0;
	cin >> n;
	int a, b, c;
	for (int i=0; i<n; i++){
		cin >> a >> b >> c;
		if (a+b+c > 1){
			sum++;
		}
	}
	cout << sum << endl;
	return 0;
}
