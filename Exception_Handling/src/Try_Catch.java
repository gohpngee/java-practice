public class Try_Catch {
    public double division(double numerator, double divisor){
        try{
            return (numerator / divisor);
        } catch (Exception e){
            System.out.println("some error");
        }
    }
}
