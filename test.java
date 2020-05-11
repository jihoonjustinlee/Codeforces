import java.util.Scanner;

public class test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<3; i++){
            sb.append(s.next());
        }
        s.close();
        System.out.println(sb);
    }
}