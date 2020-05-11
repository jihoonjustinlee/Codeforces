import java.util.Scanner;
import java.util.HashMap;

public class j236a{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        s.close();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=0; i<name.length(); i++){
            hm.put(name.charAt(i), 1);
        }
        int sum = 0;
        for (int val: hm.values()){
            sum += val;
        }
        if (sum % 2 != 0){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }
    }
}