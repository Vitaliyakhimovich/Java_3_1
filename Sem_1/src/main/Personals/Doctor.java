package main.Personals;

public class Doctor {
    protected String fullName;
    protected String instrument;
    protected Nurse nurse;


    public Doctor(String fullName, String instrument){
        this.fullName = fullName;
        this.instrument = instrument;
        this.nurse = null;
    }

    public Doctor(String fullName, String instrument, Nurse nurse){
        this.fullName = fullName;
        this.instrument = instrument;
        this.nurse = nurse;
    }

    public Doctor() {
    }

    public void Treatment(){
        System.out.println("Лечение");
    }
}
