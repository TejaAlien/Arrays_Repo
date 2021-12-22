import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int sizeofelements = st.nextInt();
        List<Integer> a = new ArrayList<>();

        for(int i=0;i<sizeofelements;i++){
            int elemnent = st.nextInt();
            a.add(new Integer(elemnent));
        }
        System.out.print(a+" ");
        int Queries = st.nextInt();
        for(int i=0; i<Queries;i++) {
            String insertplusdelete = st.next();
            if (insertplusdelete.equals("Insert")) {
                int index = st.nextInt();
                int value = st.nextInt();
                a.add(index, value);
            } else if (insertplusdelete.equals("Delete")) {
                int deletevalueatindex = st.nextInt();
                a.remove(deletevalueatindex);
            }
        }
        for(int i=0;i<sizeofelements;i++){
            System.out.println(a.get(i)+" ");
        }
        System.out.println();
    }
}
