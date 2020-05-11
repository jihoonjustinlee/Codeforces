#include <iostream>

using namespace std;

int main(){
    int n;
    string rocks;
    cin >> n >> rocks;
    char temp = rocks[0];
    int answer = 0;
    for (int i=1; i<n && n != 1; i++){
        if (rocks[i] == temp){
            answer++;
        }
        temp = rocks[i];
    }
    cout << answer << endl;
}