package main.clients;

import java.time.LocalDate;

// СОСТОЯНИЯ (ПОЛЯ)
public abstract class Animal {
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;


// КОНСТРУКТОРЫ
    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal(){
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болезнь"));
    }

// МЕТОДЫ()
    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }
// ПЕРЕГРУЗКА + ИНКАПСУЛЯЦИЯ
    private   void wakeUp(){
        System.out.println("Животное проснулось");
    }
    private   void wakeUp(String time){
        System.out.println("Животеное проснулось " + nickname + "проснулось в " + time);
    }
//КОНЕЦ ПЕРЕГРУЗКИ
    private void hunt(){
        System.out.println("Животное охотиться");
    }

    public abstract void eat();

    private void sleep(){
        System.out.println("Животное уснуло");
    }



    public String getType(){
        return getClass().getSimpleName();
    }

    //ПЕРЕОПРЕДЕЛЕНИЕ (Одна из функций полиморфизма)
    @Override
    public String toString() {
        return String.format("nickname = %s, birthDate = %s, owner = %s, illness = %s", nickname, birthDate, owner,illness );
    }
}
