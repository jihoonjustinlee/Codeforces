#include <iostream>

using namespace std;

int main(){
	string a,b;
	int sum = 0;
	cin >> a >> b;
	for (int i=0; i<a.size(); i++){
		char x = tolower(a.at(i));
		char y = tolower(b.at(i));
		
		if (int(x) == int(y)){
			continue;
		}
		else if (int(x) < int(y)){
			sum--;
		}
		else if (int(x) > int(y)){
			sum++;
		}
	}
	if (sum > 0){
		cout << 1 << endl;
	}
	else if (sum < 0){
		cout << -1 << endl;
	}
	else{
		cout << 0 << endl;
	}

	return 0;
}