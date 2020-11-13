import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Apple;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].makeNoise());
        }
        Edible[] eat = new Edible[3];
        eat[0] = new Chicken();
        eat[1] = new Apple();
        eat[2] = new Orange();
        for(Edible edible: eat){
            System.out.println(edible.howToEat());
        }
    }
}
