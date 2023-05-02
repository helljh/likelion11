public class Dog extends Animal{

    public Dog(String name, int age){
        this.spec = "개";
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println("멍멍");
    }
}
