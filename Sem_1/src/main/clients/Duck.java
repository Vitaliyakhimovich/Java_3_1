package main.clients;

import java.time.LocalDate;

public class Duck extends Animal {
    String size;

    public Duck(String nickname, Owner owner, LocalDate birthDate, Illness illness, String size) {
        super(nickname, owner, birthDate, illness);
        this.size = size;
    }

    @Override
    public void toDo() {
        System.out.println("Я умею двигаться");
    }

    @Override
    public void toFly() {
        System.out.println("Я умею летать");
    }

    @Override
    public void toSwim() {
        System.out.println("Я умею плавать");
    }
}
