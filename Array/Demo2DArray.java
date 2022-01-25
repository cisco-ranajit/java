import java.util.*;

public class Demo2DArray {
    void DeclarationOf2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter size for columns");
        int col = input.nextInt();
        System.out.println("enter size for rows");
        int row = input.nextInt();
        String Names[][] = new String[col][row];
        System.out.println("enter elements for 2-d array");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                Names[i][j] = input.next();
            }
        }
        System.out.println("the 2d-array elements");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(Names[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiplicationOfArray() {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base of squared matrices");

        n = input.nextInt();

        int[][] a = new int[n][n];

        int[][] b = new int[n][n];

        int[][] c = new int[n][n];

        System.out.println("Enter the elements of 1st martix row wise \n");

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                a[i][j] = input.nextInt();

            }

        }

        System.out.println("Enter the elements of 2nd martix row wise \n");

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                b[i][j] = input.nextInt();

            }

        }

        System.out.println("Multiplying the matrices...");

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                for (int k = 0; k < n; k++)

                {

                    c[i][j] = c[i][j] + a[i][k] * b[k][j];

                }

            }

        }

        System.out.println("The product is:");

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                System.out.print(c[i][j] + " ");

            }

            System.out.println();

        }

        input.close();

    }

    void Addition() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of squared matrices");
        n = input.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("Enter the elements of 1st martix row wise \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd martix row wise \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Multiplying the matrices...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }

    void Substraction() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of squared matrices");
        n = input.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("Enter the elements of 1st martix row wise \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd martix row wise \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Substracting the matrices...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
    void identity() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of squared matrices");
        System.out.println(" ");
        int n = input.nextInt();
        System.out.println(" ");
        System.out.println("the identity matrix ::");
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Demo2DArray ob;
        ob = new Demo2DArray();
        System.out.println("1. Declaration of 2-D Array");
        System.out.println(" ");
        System.out.println("2. Multiplicaion of 2-D Array (Matrix");
        System.out.println(" ");
        System.out.println("3. Additon of 2-D Array (Matrix)");
        System.out.println(" ");
        System.out.println("4. Substraction of 2-D Array (Matrix)");
        System.out.println(" ");
        System.out.println("5. Identity Matrix");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("choose between 1 to 5");
        int number = input.nextInt();
        switch (number) {
            case 1:
                ob.DeclarationOf2DArray();
                break;
            case 2:
                ob.multiplicationOfArray();
                break;
            case 3:
                ob.Addition();
                break;
            case 4:
                ob.Substraction();
                break;
            case 5:
                ob.identity();
                break;
            default:
                System.out.println("you entered invalid number, please enter number 1 t0 3");
                break;
        }
        input.close();

    }

}
