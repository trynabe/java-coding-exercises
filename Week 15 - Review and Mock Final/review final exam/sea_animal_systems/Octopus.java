package sea_animal_systems;

public class Octopus extends SeaAnimal {
    public Octopus(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Octopus moves using jet propulsion.");
    }
}
