public class Cat extends Animals{
    public Cat(String name, String breed, int age){
        super(name, breed, age);
    }

    @Override
    public void make_Sound() {
        System.out.println("meowowowowow");
    }
}
