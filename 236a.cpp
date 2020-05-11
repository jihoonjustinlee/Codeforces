#include <iostream>
#include <unordered_map>

using namespace std;

int main(){
    string name;
    cin >> name;
    unordered_map<char, int> m;
    for (int i=0; i<name.length(); i++){
        m[name[i]]++;
    }
    cout << m << endl;
    return 0;
}