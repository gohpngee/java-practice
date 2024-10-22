public class ft_Fibonacci {
    public static int fibonacci (int n){
        if (n <= 1)
            return n;
        int first = 0;
        int second = 1;
        int result = 0;
        int i = 2;

        while (i <= n){
            result = first + second;
            first = second;
            second = result;
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        int n = 11;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
        System.out.println("Fibonacci of " + (n+1) + " is: " + fibonacci(n+1));
        System.out.println("Fibonacci of " + (n+2) + " is: " + fibonacci(n+2));
    }
}
