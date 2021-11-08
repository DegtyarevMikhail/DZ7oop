package GeekBrains;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Matroskin", 10),
                new Cat("Leopold", 15),
                new Cat("TsapTsarapych", 25),
                new Cat("Tom", 5),
                new Cat("Murka", 1)
        };

        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }
}
