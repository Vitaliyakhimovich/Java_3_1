package main.clients;

import java.time.LocalDate;

public class Pigeon extends Animal implements Goable,Flyable {


    public Pigeon(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Pigeon() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Кушает зерно");
    }

    @Override
    public void toFly() {
        System.out.println("Я умею плавать");

    }

    @Override
    public void toDo() {
        System.out.println("Я умею ходить");
    }
}
