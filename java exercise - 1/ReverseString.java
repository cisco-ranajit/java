public class ReverseString{
    public static void main(String[] args) {
        String rev = "123";
        System.out.println(rev);
        for(int i = rev.length();i>0;--i){
            System.out.print(rev.charAt(i-1));
        }
    }
}
