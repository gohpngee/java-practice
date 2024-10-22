import javax.lang.model.type.NullType;

public class prime_numbers {
    public static int ft_is_prime (int n) {
        int root = 3;

        if (n == 1)
            return 0;
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n % 2 == 0)
            return 0;
        while (root * root <= n) {
            if (n % root == 0) {
                return 0;
            }
            root += 2;
        }
        return 1;
    }
    public static void main(String[] args){
        int thirty_one = 31;
        int fourty_two = 42;
        if (ft_is_prime(fourty_two) == 1)
            System.out.println(fourty_two + " is prime.");
        else
            System.out.println(fourty_two + " is not prime.");
    }
}
