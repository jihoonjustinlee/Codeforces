import java.util.Scanner;

public class j112a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String first = s.nextLine().toLowerCase();
        String second = s.nextLine().toLowerCase();
        s.close();
        int sum = 0;
        for (int i=0; i<first.length(); i++){
            int first_int = (int)first.charAt(i);
            int second_int = (int)second.charAt(i);
            if (first_int > second_int){
                sum++;
            }
            else if (first_int < second_int){
                sum--;
            }
        }
        if (sum > 0) {
            System.out.println(1);
        }   
        else if (sum < 0){
            System.out.println(-1);
        }
        else{
            System.out.println(0);
        }
        // System.out.println(sum);
    }
}