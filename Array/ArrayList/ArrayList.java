import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayLists{
   public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();  //for integer value
    //ArrayList<String> list = new ArrayList<>(); //for string value
    //add elements
    list.add(0);  //index[0]
    list.add(2);  //index[1]
    list.add(3);  //index[2]
    System.out.println(list);

    //geting elements from specific index
    int element = list.get(2);
    System.out.println(element);

    //add elements in between two index
    list.add(1, 1);  //list.add(index[number], element)
    System.out.println(list);

    //set elements in array list

    list.set(0, 5);
    System.out.println(list);

    //delete elements in array list
    list.remove(3);
    System.out.println(list);

    //size of elements in array
    int size = list.size();
    System.out.println(size);

    //loops
    for(int i =0; i<list.size(); i++){
       System.out.println(list.get(i));
    }
    //sorting
    Collections.sort(list);
    System.out.println(list);
   }
}
