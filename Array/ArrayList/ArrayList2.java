import java.util.*;

class ArrayList2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of ArrayList");
        int size = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size + 1);
        System.out.println("enter elements of ArrayList");
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
        System.out.println("the elememts of ArrayList");
        System.out.println(list);
        System.out.println();
        System.out.println("enter index number ");
        int index = input.nextInt();
        System.out.println("adding new element in given ArrayList");
        int n = input.nextInt();
        list.add(index, n);
        int ArrSize = list.size();
        System.out.println("size of ArraList is after adding new element = " + ArrSize);
        System.out.println("after adding element");
        System.out.println(list);
        System.out.println("enter index number which you want to delete");
        int delete = input.nextInt();
        System.out.println("deleteing element from ArrayList");
        list.remove(delete);
        System.out.println(list);
        System.out.println("sorting ArrayList");
        Collections.sort(list);
        System.out.println(list);
        input.close();
    }
}
