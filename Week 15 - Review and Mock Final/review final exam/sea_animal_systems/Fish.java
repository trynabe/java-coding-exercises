package sea_animal_systems;

public class Fish extends SeaAnimal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Fish swims by moving its tail.");
    }
}