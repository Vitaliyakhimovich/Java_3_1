package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {

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
    public String toString() {
        return super.toString() + "Discount("+discount+")";
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
        System.out.println("Прости, я не умею плавать");
    }
}
