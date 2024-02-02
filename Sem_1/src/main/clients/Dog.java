package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }
}
