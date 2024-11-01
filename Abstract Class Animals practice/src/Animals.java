public abstract class Animals {
    int age;
    String name;
    String breed;

    public Animals (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public abstract void make_Sound();

    public void print_name_and_age() {
        System.out.println("Animal's name is " + name + ", a " + breed + ", and it is " + age + " years old.");
    }
}
