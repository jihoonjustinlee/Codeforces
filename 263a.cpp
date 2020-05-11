#include <iostream>

using namespace std;

int main(){
    int matrix[5][5];
    for (int i=0; i<5; i++){
        cin >> matrix[i][0] >> matrix[i][1] >> matrix[i][2] >> matrix[i][3] >> matrix[i][4];
    }
    int sum;
    for (int row=0; row<5; row++){
        for (int col=0; col<5; col++){
            if (matrix[row][col] == 1){
                sum = abs(row - 2) + abs(col - 2);
            }   
        }
    }
    cout << sum << endl;

    return 0;
}