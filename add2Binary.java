public class add2Binary {
    static String add(String x ,String y){

        int add0 = Integer.parseInt(x );
        int add1 = Integer.parseInt(y );
        int sum = add0 + add1;
        System.out.println(sum);
        return x;
    }
    public static void main(String[] args) {
        String x = "1001";
        String y = "101";
        add(x,y);
    }

}
