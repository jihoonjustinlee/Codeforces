#include <iostream>
#include <string>

using namespace std;

int main(){
    string expression;
    cin >> expression;
    int one = 0;
    int two = 0;
    int three = 0;
    for (int i=0; i<expression.length(); i++){
        if (expression[i] == '1'){
            one++;
        }
        else if (expression[i] == '2'){
            two++;
        }
        else if (expression[i] == '3'){
            three++;
        }
    }
    string new_string;
    for (int i=0; i<one; i++){
        new_string.append("1+");
    }
    for (int i=0; i<two; i++){
        new_string.append("2+");
    }
    for (int i=0; i<three; i++){
        new_string.append("3+");
    }
    if (new_string[new_string.length()-1] == '+'){
        new_string.erase(new_string.length()-1);
    }
    cout << new_string << endl;
    
}