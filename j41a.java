import java.util.Scanner;

public class j41a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String first = s.next();
        String second = s.next();
        s.close();
        StringBuilder sb = new StringBuilder(second).reverse();
        second  = sb.toString();
        if (first.equals(second)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}