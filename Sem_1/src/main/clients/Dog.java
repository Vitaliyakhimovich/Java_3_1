package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собачка кушает");
    }
    @Override
    public void toDo() {
        System.out.println("Я умею двигаться");

    }
}
