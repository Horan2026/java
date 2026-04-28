package test4;

abstract class Spaceship{
    private int engineNum;
    private int crewCapacity;
    public Spaceship(int engineNum, int crewCapacity){
        this.engineNum =engineNum;
        this.crewCapacity = crewCapacity;
    }
    public abstract void dispaly();
    public int getEngineNum(){
        return engineNum;
    }
    public int getCrewCapacity(){
        return crewCapacity;
    }
}
class Cargoship extends Spaceship{
    public Cargoship(int engineNum, int crewCapacity){
        super(engineNum, crewCapacity);
    }
    @Override
    public void dispaly(){
        System.out.println("CargoShip info:");
        System.out.println("engineNum:" + getEngineNum());
        System.out.println("crewCapacity:" + getCrewCapacity());
        System.out.println("\n");
    }
}
class FighterShip extends Spaceship{
    public FighterShip(int engineNum, int CrewCapacity){
        super(engineNum, CrewCapacity);
    }
    @Override
    public void dispaly() {
        System.out.println("FighterShip info:");

        System.out.println("engineNum:" + getEngineNum());
        System.out.println("crewCapacity:" + getCrewCapacity());
        System.out.println("\n");
    }
}
public class S4_4 {
    public static void main(String[] args) {
        Spaceship ship1 = new Cargoship(4, 10);
        Spaceship ship2 = new FighterShip(2, 5);
        ship1.dispaly();
        ship2.dispaly();
    }
}
