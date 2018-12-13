
/**
 * Java. Level 1. Lesson 7. Example of homework
 *
 * @author Egor Nikonov
 * @version dated Dec 13, 2018
 */
class J1Lesson7 {
    public static void main(String[] args) {
        Cat[] arrcat = {new Cat("Murzik", 14),
                new Cat("Servantes", 18),
                new Cat("Baron", 25),
                new Cat("Kotik", 10)};
        Plate plate = new Plate(10);
        for (Cat cat : arrcat) {
            System.out.println(cat);
        }
        System.out.println(plate);
        System.out.println("Больше еды!");
        plate.addFood(50);
        System.out.println(plate);
        for (Cat cat : arrcat) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }

    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean joy;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.joy = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            joy = true;
        }

    }

    @Override
    public String toString() {
        return "Кличка: " + name + " <> Appetite :" + appetite + " <> Joy: " + joy;
    }


}

class Plate {
    private int food;

    Plate(int food) {

        this.food = food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int getFood() {
        return food;
    }

    public void addFood(int add) {
        food += add;
    }

    @Override
    public String toString() {
        return "Food :" + food;
    }
}
