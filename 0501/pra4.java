public class pra4 {
    public static void main(String[] args){
        Cat cat = new Cat("방울이", 5);
        Dog dog = new Dog("댕댕이", 2);

        cat.makeSound();
        dog.makeSound();

        System.out.println(cat.spec);
    }
}
