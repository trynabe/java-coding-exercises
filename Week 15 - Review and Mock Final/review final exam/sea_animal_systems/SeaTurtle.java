package sea_animal_systems;

public class SeaTurtle extends SeaAnimal {
    public SeaTurtle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Sea turtle glides gracefully through water.");
    }
}
