import java.util.ArrayList;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        int m, x, y;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            m = scanner.nextInt();
            line.add(m);
            for (int j = 0; j < m; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> pos = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(x > n || y > (lines.get(x - 1).getFirst())){
                pos.add("ERROR!");
            }
            else{
                int p = lines.get(x - 1).get(y);
                pos.add(new String(String.valueOf(p)));
            }
        }

        for (int i = 0; i < q; i++){
            System.out.println(pos.get(i));
        }
    }
}