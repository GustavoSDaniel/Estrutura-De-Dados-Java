package arraylistELinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestPerformaceListasArrayListELinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();  // ArrayList - Tempo de acesso: 0 ms O(1)
        List<Integer> linkedList = new LinkedList<Integer>() ; // LinkedList - Tempo de acesso: 65 ms O(n)

        for (int i = 0; i < 100000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        long inicioArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            arrayList.get(i * 100);
        }
        long fimArray = System.currentTimeMillis();

        long inicioLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            linkedList.get(i * 100);
        }

        long fimLinked = System.currentTimeMillis();

        System.out.println("ArrayList - Tempo de acesso: "+ (fimArray - inicioArray) + " ms");
        System.out.println("LinkedList - Tempo de acesso: "+ (fimLinked - inicioLinked) + " ms");


    }



}
