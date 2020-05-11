import java.util.Scanner;

public class j546a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cost = s.nextInt();
        int current = s.nextInt();
        int num = s.nextInt();
        s.close();
        int sum = 0;
        for (int i=1; i<=num; i++){
            sum += cost * i;
        }
        if (current >= sum){
            System.out.println(0);
        }
        else{
            System.out.println(sum - current);
        }        
    }
}