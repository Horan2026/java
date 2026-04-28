package test4;

public class Animal {
    private String name;
    private int age;
    private String species;
    private String habitat;

    public Animal(String name, int age, String species, String habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
    }
    //Animal Animal1 = new Animal("pipi", 2, "bird", "forest");

    void makeSound() {
        System.out.println("The " + species + " makes a sound.");
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
    }

    void eat(){
        System.out.println("The "+  species +" is eatng.");
    }
    public String getName(){
        return name;
    }

}

