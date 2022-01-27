import java.util.*;
class ArrayOperation{
	Scanner input = new Scanner(System.in);
	
	void InsertArray(){
		System.out.println("enter size of array");
		int size = input.nextInt();
	    int arr[] = new int[size + 1];
		System.out.println("enter elements of array");
		for( int i = 0; i < size; i++){
			arr[i] = input.nextInt();
		}
		System.out.println("the elements of array");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("enter the new element");
		int new_element = input.nextInt();
		System.out.println("enter the position of array where you want to insert");
		int position = input.nextInt();
		for(int i = size; i >= position; i--){
			arr[i] = arr[i - 1 ];
		} arr [position - 1] = new_element;
			for( int i = 0;i <= size; i++){
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	void DeleteElement(){
		System.out.println("size of array");
		
		int size = input.nextInt();
		int arr[] = new int[size];
		
		System.out.println("enter elements of array");
		for( int i = 0; i < size; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.println("the elements of array");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("enter the element which you want to delete");
		int delete = input.nextInt();
		for( int i = 0; i < size - 1; i++){
			if(arr[i] == delete){
				for(int j = i; j < size - 1; j++){
					arr[j] = arr[j + 1];
				}
			}
		}
		System.out.println("deleted element"+delete);
		for(int i = 0 ; i < size-1; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		ArrayOperation ob = new ArrayOperation();
		ob.InsertArray();
		ob.DeleteElement();
	}
}