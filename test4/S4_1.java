package test4;

public class S4_1 {
    public static void main(String[] args){
        Animal animal = new Animal("zywoo", 3, "bee", "forest");
        Monkey monkey = new Monkey("donk", 2, "loong", "forest", "jump", 10);

        animal.displayInfo();
        animal.makeSound();
        animal.eat();

        monkey.displayInfo();
        monkey.makeSound();
        monkey.eat();
        monkey.climbTree();
    }
}
