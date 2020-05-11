import java.util.Scanner;

public class j617a {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int friendHouse = s.nextInt();
        s.close();
        int count = 0;
        while(friendHouse > 0){
            if (friendHouse >= 5){
                friendHouse -= 5;
            }
            else if (friendHouse >= 4){
                friendHouse -= 4;
            }
            else if (friendHouse >= 3){
                friendHouse -= 3;
            }
            else if (friendHouse >=2){
                friendHouse -= 2;
            }
            else if (friendHouse >=1){
                friendHouse -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}