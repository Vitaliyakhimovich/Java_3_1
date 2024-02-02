package main.clients;

import java.time.LocalDate;

public class Tortoise extends Animal {
    String habitat;

    public Tortoise(String nickname, Owner owner, LocalDate birthDate, Illness illness, String habitat) {
        super(nickname, owner, birthDate, illness);
        this.habitat = habitat;
    }

    public  Tortoise(){
        super();
        this.habitat = habitat;
    }

    @Override
    public void toDo() {
        System.out.println("Я умею двигаться");
    }

    @Override
    public void toFly() {
        System.out.println("Прости, я не умею летать");
    }

    @Override
    public void toSwim() {
        System.out.println("Я умею плавать");
    }
}
