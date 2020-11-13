package animal;


import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeNoise() {
        return "pock pock pock";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
