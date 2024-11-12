public class Person_info {
    private String name;
    private int age;

    //constructor
    public Person_info(String name, int age){
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age <= 0){
            System.out.println("age cannot be 0 or less");
        }
        else
            this.age = age;
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            System.out.println("name field cannot be empty");
        }
        else
            this.name = name;
    }

    public void introduction() {
        if (name != null && age > 0)
            System.out.println("Hello there, my name is " + name + " and I am " + age + " years old! Nice meeting you.");
        else
            System.out.println("Please enter a valid name and age.");
    }
}
