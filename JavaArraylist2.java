import java.util.ArrayList;
import java.util.Collections;
public class JavaArraylist2 {
    public static void main(String args[]){
    ArrayList<Integer>list = new ArrayList<>();
    list.add(1);
    list.add(6);
    list.add(3);
    list.add(4);
    list.add(5);

    //for(int i=list.size()-1; i>=0; i--){
       // System.out.print(list.get(i) + " ");

   // }
    //System.out.println();
//ascending order
System.out.println(list);

Collections.sort(list);
System.out.println(list);
    
    // desending order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    }

    
}
