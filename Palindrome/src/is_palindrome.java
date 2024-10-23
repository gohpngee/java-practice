public class is_palindrome {
    public static boolean palindrome(String input){
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String racecar = "racecar";
        String pencil = "pencil";
        if (palindrome(racecar) == false)
            System.out.println(racecar + " is not a palindrome");
        else
            System.out.println(racecar + " is a palindrome");
        if (palindrome(pencil) == false)
            System.out.println(pencil + " is not a palindrome");
        else
            System.out.println(pencil + " is a palindrome");
    }
}
