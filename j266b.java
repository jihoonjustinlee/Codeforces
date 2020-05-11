import java.util.Scanner;

public class j266b {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int time = s.nextInt();
        String queueIn = s.next();
        s.close();
        StringBuilder queue = new StringBuilder(queueIn);

        for (int i=0; i<time; i++){
            for (int j=0; j<queue.length(); j++){
                if (queue.charAt(j) == 'B' && j+1 < queue.length() && queue.charAt(j+1) == 'G'){
                    queue.setCharAt(j, 'G');
                    queue.setCharAt(j+1, 'B');
                    j++;
                }
            }
        }
        System.out.println(queue.toString());
    }
}