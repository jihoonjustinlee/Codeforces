import java.util.Scanner;

public class j791a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int limak = s.nextInt();
        int bob = s.nextInt();
        int count = 0;
        while(limak <= bob){
            limak *= 3;
            bob *= 2;
            count++;
        }
        s.close();
        System.out.println(count);
    }
}