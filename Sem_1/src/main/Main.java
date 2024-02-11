package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Солнышко", new Owner("Яхимович Иван Иванович"),
                LocalDate.of(2021, 12,24),
                new Illness("Туберкулез"), 10D); // Создаем экземпляр класса

        Duck duk_1 = new Duck("Уточка", new Owner("Иванов Иван иванович"),
                LocalDate.of(2020,9, 11), new Illness("Чума"), "Больше 2 кг");

        Pigeon pig_1 = new Pigeon("Крылатик", new Owner("Яхимович Илья Иванович"),
                LocalDate.of(2021, 12,24), new Illness("Туберкулез"));

        Cat catty = new Cat();
        Tortoise tortoise_1 = new Tortoise();




        List <Animal> animals = new ArrayList<Animal>();

        animals.add(cat);
        animals.add(duk_1);
        animals.add(pig_1);
        animals.add(catty);
        animals.add(tortoise_1);

//
////
//        int i = 0;
//        for( i = 0; i < animals.size(); i ++){
//            Animal an = animals.get(i);
//            if (an instanceof Cat)
//            ((Cat) an).eat();


        }
    }

