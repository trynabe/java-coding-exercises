package sea_animal_systems;

public class Main {
    public static void main(String[] args) {
        SeaAnimal[] animals = new SeaAnimal[3];

        animals[0] = new Fish("Nemo");
        animals[1] = new Octopus("Bonus");
        animals[2] = new SeaTurtle("Crush");

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
    }
}
