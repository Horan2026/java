package test4;

public class Monkey extends Animal{
    private String hobby;
    private double weight;
    public Monkey(String name, int age, String species, String habitat, String hobby, double weight){
        super(name, age, species, habitat);
        this.hobby = hobby;
        this.weight = weight;
    }


    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("The monkey says 'Ooh ooh ah ah'.");
    }
    @Override
    void eat(){
        super.eat();
        System.out.println("The monkey is eating bananas.");
    }
    void climbTree(){
        System.out.println("The monkey "+ getName() +" is climbing a tree.");
    }
}
