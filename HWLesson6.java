/**
 * Java. Level 1. Lesson 6. Example of homework
 *
 * @author Egor Nikonov
 * @version dated Dec 9, 2018
 */
class HWLesson6 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat("Barsik", "white", 4, 300, 0.8),
                new Dog("Sharik", "black", 12, 300, 0.3)};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
            System.out.println(" run: " + animal.run());
            System.out.println(" swim: " + animal.swim());
            System.out.println(" jump: " + animal.jump());
        }
    }
}

class Cat extends Animal {
    Cat(String name, String color, int age, int length, double height) {
        super(name, color, age, length, height);
    }

    public boolean run() {
        if (length < 200) {
            return true;
        }
        return false;
    }

    public boolean swim() {
        System.out.print(name + " Не умеет плавать");
        return false;
    }

    public boolean jump() {
        if (height < 2) {
            return true;
        }
        return false;
    }

    public String voice() {
        return name + " say meow!";
    }
}

class Dog extends Animal {
    Dog(String name, String color, int age, int length, double height) {
        super(name, color, age, length, height);
    }

    public boolean run() {
        if (length < 500) {
            return true;
        }
        return false;
    }

    public boolean swim() {
        if (length < 10) {
            return true;
        }
        return false;
    }

    public boolean jump() {
        if (height < 0.5) {
            return true;
        }
        return false;
    }

    public String voice() {
        return name + " say gaf-gaf!";
    }
}

interface IAnimal {
    String voice();

    boolean run();

    boolean swim();

    boolean jump();
}

abstract class Animal implements IAnimal {
    String name;
    String color;
    int age;
    int length;
    double height;

    Animal(String name, String color, int age, int length, double height) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {

        return name + ", " + color + ", " + age + "," + length + "," + height;
    }
}
