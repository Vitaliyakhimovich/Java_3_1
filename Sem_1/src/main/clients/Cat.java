package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable{

    Double discount;


    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала и кушает ");
    }

    @Override
    public String toString() {
        return super.toString() + "Discount("+discount+")";
    }
    @Override
    public void toDo() {
        System.out.println("Я умею двигаться");
    }

}
