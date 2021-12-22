import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        List<List<Integer>> data = new ArrayList<List<Integer>>(numLines);
        for(int i=0; i<numLines; i++) {
            int numElems = scanner.nextInt();
            List<Integer> elems = new ArrayList<Integer>(numElems);
            for(int j=0; j<numElems; j++) {
                int elem = scanner.nextInt();
                elems.add(new Integer(elem));
            }
            data.add(elems);
            //System.out.println("elems" + i + ": " + elems.toString());
        }

        int queries = scanner.nextInt();
        for(int i=0; i<queries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            //System.out.println("x:" + x + ", y:" + y);

            if (x < 1 || x > numLines) {
                System.out.println("ERROR!");
                continue;
            }
            try {
                List<Integer> elemList = data.get(x - 1);
                if (y < 1 || y > elemList.size()) {
                    System.out.println("ERROR!");
                    continue;
                }
                Integer val = elemList.get(y - 1);
                System.out.println(val);
            } catch (Exception ex) {
                System.out.println("msg:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
