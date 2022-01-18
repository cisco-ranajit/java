import java.util.ArrayList;
import java.util.Arrays;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("before removing the array element");
        names.add("Ranajit khandual");
        names.add(1, "sagar pattanaik");
        names.add(2, "deenabandhu daitari");
        System.out.println(names);


        // remove element from array list
        System.out.println("after removing the array element index[0]");

        names.remove(0);

        System.out.println(names);

        System.out.println("converting the ArrayList to Array");
        

        String[] Names = new String[names.size()];
        Names = names.toArray(Names);

        for(String x : Names)

        System.out.println(x + " ");



    }
}
