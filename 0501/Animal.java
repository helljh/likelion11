public class Animal {
    public String spec; // 종
    public String name; // 이름
    public int age; // 나이

    public Animal(){

    }
    public Animal(String spec, String name, int age){
        this.spec = spec;
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }
}
