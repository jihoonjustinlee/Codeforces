import java.util.Scanner;

public class j467a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i=0; i<n; i++){
            int ppl = s.nextInt();
            int rooms = s.nextInt();
            if (rooms - ppl >= 2){
                count++;
            }
        }
        s.close();
        System.out.println(count);
    }
}