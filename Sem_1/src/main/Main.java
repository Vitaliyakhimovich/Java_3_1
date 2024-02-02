package main;

import main.clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Яхимович Иван Иванович"),
                LocalDate.of(2021, 12,24),
                new Illness("Туберкулез")); // Создаем экземпляр класса

        Animal duk_1 = new Duck("Уточка", new Owner("Иванов Иван иванович"),
                LocalDate.of(2020,9, 11), new Illness("Чума"), "Больше 2 кг");

        duk_1.toDo();
        duk_1.toFly();
        duk_1.toSwim();

        Animal catty = new Cat();

        catty.toDo();
        catty.toFly();
        catty.toSwim();

        Animal tortoise_1 = new Tortoise();

        tortoise_1.toDo();
        tortoise_1.toFly();
        tortoise_1.toSwim();

//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickname());
//
//        cat.setIllness(new Illness(null));
//
//        System.out.println(cat.getIllness());
//
//        Animal testAnimal = new Animal();
//
//        cat.lifeCycle();
//
//
//        System.out.println(cat.getType());
//        System.out.println(cat);
//
//        Animal catty = new Cat();
//        Dog doggy = new Dog();
//
//        System.out.println(doggy.getType());
//        System.out.println(catty.getType());
//
//        System.out.println(catty);
//
//        Cat.meow();
//
//        List<Animal> animals = new ArrayList<Animal>();
//
//        animals.add(catty);
//        animals.add(doggy);
//        animals.add(cat);
//
//        int i = 0;
//        for(Animal animal : animals){
//            System.out.println(i + " " + animal);
//            i ++;
//        }
    }
}
