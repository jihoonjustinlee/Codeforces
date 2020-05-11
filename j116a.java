import java.util.Scanner;

public class j116a{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        int capacity = 0;
        for (int i=0; i<n; i++){
            int exit = s.nextInt();
            int enter = s.nextInt();
            capacity = capacity - exit + enter;
            if (capacity > max){
                max = capacity;
            }
        }
        s.close();
        System.out.println(max);
    }
}