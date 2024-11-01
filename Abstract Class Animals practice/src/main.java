public class main {
    public static void main(String[] args){
        Dog Pepper = new Dog("Pepper", "Pomeranian", 16);
        Dog Ollie = new Dog("Ollie", "Poodle", 2);
        Cat Meow = new Cat("Meow", "Ragdoll", 3);
        Cat Olivia = new Cat("Olivia", "British Short Hair", 1);
        Pepper.print_name_and_age();
        Ollie.print_name_and_age();
        Meow.print_name_and_age();
        Olivia.print_name_and_age();
    }
}
