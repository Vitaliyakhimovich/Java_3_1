package main;

import main.Personals.Doctor;
import main.Personals.Nurse;
import main.clients.*;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {


    public void addAnimals(){
        List<Animal> listAnimals = new ArrayList<Animal>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Pigeon pigeon = new Pigeon();
        Tortoise tortoise = new Tortoise();

        listAnimals.add(cat);
        listAnimals.add(dog);
        listAnimals.add(duck);
        listAnimals.add(pigeon);
        listAnimals.add(tortoise);
        System.out.println(listAnimals);
    }
    public void getGonable(){
        List<Goable> listGonable = new ArrayList<Goable>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        listGonable.add(dog);
        System.out.println(listGonable);
    }
    public void getSwimable(){
        List<Swimable> listSwimable= new ArrayList<Swimable>();
        Duck duck = new Duck();
        Tortoise tortoise = new Tortoise();

        listSwimable.add(duck);
        listSwimable.add(tortoise);
        System.out.println(listSwimable);
    }
    public void getFlyable(){
        List<Flyable> listFlyable = new ArrayList<Flyable>();
        Duck duck = new Duck();
        Pigeon pigeon = new Pigeon();

        listFlyable.add(duck);
        listFlyable.add(pigeon);
        System.out.println(listFlyable);
    }

    public void addPersonals(){
        List<Doctor> listDoctor = new ArrayList<Doctor>();
        Doctor doctor = new Doctor();

        List<Nurse> listNurse = new ArrayList<Nurse>();
        Nurse nurse = new Nurse();

        listDoctor.add(doctor);
        listNurse.add(nurse);
        System.out.println(listDoctor);
        System.out.println(listNurse);
    }

}
