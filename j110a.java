import java.util.Scanner;

public class j110a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.next();
        s.close();
        int count = 0;
        for (int i=0; i<num.length(); i++){
            if (num.charAt(i) == '7' || num.charAt(i) == '4'){
                count ++;
            }
        }
        if (count == 7 || count == 4){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}