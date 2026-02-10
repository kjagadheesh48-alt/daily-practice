public class Dog{
    String name;
    String breed;
    int age;
    String color;
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String toString(){
        return "Name is:" + name + "\n" + "Breed is:" + breed + "\n" + "Age is:" + age + "\n" + "Color is:" + color;

    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever", 3, "Golden");
        System.out.println(dog1.toString());
    }
}