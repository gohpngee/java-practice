public class Dog extends Animals{
    public Dog(String name, String breed, int age){
        super(name, breed, age);
    }

    @Override
    public void make_Sound(){
        System.out.println("woof woof");
    }
}
