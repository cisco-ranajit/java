class InsertArrayElement{
  public static void main(String args[]){
Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = input.nextInt();
        int arr[] = new int[n + 1];
        System.out.println("enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("array elements");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("insert elements in specific position of Array");
        System.out.println(" ");
        System.out.println("enter element what you want to insert");
        int element = input.nextInt();
        System.out.println("enter position of array");
        int position = input.nextInt();
        for (int i = n; i >= position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = element;
        for (int i = 0; i <= n; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
 }
}
