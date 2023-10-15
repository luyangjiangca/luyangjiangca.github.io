package ap_cs.unit7_ArrayList;
import java.util.ArrayList; 

public class Unit7_ArrayList {
    public static void main(String []args){
        //ArrayList is flexible length, dynamic calculated, need more storage vs   Array fixed length, fixed storage size
        int[] arrayA = {1, 2, 3};
        //ArrayList use object wrapper for primary type
        ArrayList<Integer> arrayListA = new ArrayList<Integer>();
        //bool -> Boolean
        //char -> Character
        arrayListA.add(8);
        arrayListA.add(0, 10);
        arrayListA.set(0, 7);
        // arrayListA.remove(0);
        System.out.println(arrayListA.size());
        for(int i = 0 ; i < arrayListA.size(); i++) {
             System.out.println(arrayListA.get(i));
        }

        
    }
    
}
