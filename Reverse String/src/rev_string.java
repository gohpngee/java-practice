public class rev_string {
    public static String reverse_string(String input){
        int len = input.length();
        String reversed = "";
        while (len > 0){
            reversed += input.charAt(len-1);
            len--;
        }
        return reversed;
    }
    public static void main(String[] args){

        String str = "ABCDEFGH";

        System.out.println("Reversed String: " + rev_string.reverse_string(str));
    }
}
