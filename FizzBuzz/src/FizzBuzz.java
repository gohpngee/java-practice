public class FizzBuzz {
    public void ft_fizz_buzz(){
        int n = 1;
        while (n <= 100){
            if ((n % 3 == 0) && (n % 5 == 0))
                System.out.println("FizzBuzz");
            else if ((n % 3 == 0) && (n % 5 != 0))
                System.out.println("Fizz");
            else if ((n % 5 == 0) && (n % 3 != 0))
                System.out.println("Buzz");
            else
                System.out.print(n + "\n");
            n++;
        }
    }
    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        fb.ft_fizz_buzz();
    }
}
