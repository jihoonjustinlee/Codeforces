import java.util.Scanner;

public class j977a{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int n = s.nextInt();
        for (int i=0; i<n; i++){
            int lastDigit = number % 10;
            if (lastDigit != 0){
                number--;
            }
            else{
                number /= 10;
            }
        }
        s.close();
        System.out.println(number);
    }
}