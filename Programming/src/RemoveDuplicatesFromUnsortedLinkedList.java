import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromUnsortedLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(5);
        System.out.println(list);
        List<Integer> removeDupilcateList = removeDuplicatesUsingLoop(list);
        System.out.println(removeDupilcateList);
      
    }

    private static List<Integer> removeDuplicatesUsingLoop(List<Integer> list) {
        List<Integer> removeDupilcateList = new LinkedList<Integer>();
        removeDupilcateList.addAll(list);
        for (int i = 0; i < removeDupilcateList.size(); i++) {
            for (int j = 1; j < removeDupilcateList.size(); j++) {
                if (removeDupilcateList.get(i)
                        .equals(removeDupilcateList.get(j))) {
                    removeDupilcateList.remove(i);
                }
            }
        }

        return removeDupilcateList;
    }

   
    
}
