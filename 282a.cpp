#include <iostream>

using namespace std;

int main(){
	int x = 0;
	int n;
	string op;
	cin >> n;

	for (int i=0; i<n; i++){
		cin >> op;
		if (op.find("++") != string::npos){
			x++;
		}
		else{
			x--;
		}
	}
	cout << x << endl;
	return 0;
}
