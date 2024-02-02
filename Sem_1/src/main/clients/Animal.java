package main.clients;

import java.time.LocalDate;

//Todo СОСТОЯНИЯ (ПОЛЯ)
public class Animal {
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;


// Todo КОНСТРУКТОРЫ
    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal(){
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болезнь"));
    }

// Todo МЕТОДЫ()
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
//Todo ПЕРЕГРУЗКА + ИНКАПСУЛЯЦИЯ
    private   void wakeUp(){
        System.out.println("Животное проснулось");
    }
    private   void wakeUp(String time){
        System.out.println("Животеное проснулось " + nickname + "проснулось в " + time);
    }
//Todo КОНЕЦ ПЕРЕГРУЗКИ
    private void hunt(){
        System.out.println("Животное охотиться");
    }

    private void eat(){
        System.out.println("Животное ест");
    }

    private void sleep(){
        System.out.println("Животное уснуло");
    }

    public void lifeCycle(){
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public void toDo(){
        System.out.println("Двигаться");
    }
    public void toFly(){
        System.out.println("Летать");
    }
    public void toSwim(){
        System.out.println("Плавать");
    }


    //Todo ПЕРЕОПРЕДЕЛЕНИЕ (Одна из функций полиморфизма)
    @Override
    public String toString() {
        return String.format("nickname = %s, birthDate = %s, owner = %s, illness = %s", nickname, birthDate, owner,illness );
    }
}
