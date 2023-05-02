public class Cat extends Animal{

    public Cat(String name, int age){
        this.spec = "고양이";
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println("야옹");
    }

}
