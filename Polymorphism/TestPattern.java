import java.util.Scanner;

class Pattern {
    Scanner input = new Scanner(System.in);
    int n, columns, rows;
    void input(){}
    void show(){}
}class Pattern_1 extends Pattern{
    void input(){
        System.out.println("this is a box * pattern ");
        columns = input.nextInt();
        rows = input.nextInt();
    }
    void show() {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}class Pattern_2 extends Pattern{
     void input() {
         System.out.println(" this is a box out layer * patter");
         columns = input.nextInt();
         rows = input.nextInt();
    }
    void show(){
         for(int i = 0; i < columns; i++){
             for(int j = 0; j < rows; j++){
                 if(i == 0|| i == columns-1 || j == 0 || j == rows -1){
                     System.out.print("*");
                 }else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
    }
}
class Pattern_3 extends Pattern{
    void input(){
        System.out.println("this is a left half triangle * patter");
        columns = input.nextInt();
    }
    void show(){
        for( int i = 1; i <= columns ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class TestPattern{
    public static void main(String[] args) {
        Pattern ob;
        ob = new Pattern_1();
        ob.input();
        ob.show();
        ob = new Pattern_2();
        ob.input();
        ob.show();
        ob = new Pattern_3();
        ob.input();
        ob.show();
    }
}
