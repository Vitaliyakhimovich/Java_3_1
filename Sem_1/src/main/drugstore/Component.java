package main.drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
     Integer power;

    public Component(String title, Double weight, Integer power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }


    @Override
    public String toString() {
        return String.format("title = %s, power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
//        return this.power - o.power;      1 Вариант
//        return this.power.compareTo(o.power);   2 Вариант
        if (this.power < o.power) {
            return -1;
        } else if (this.power > o.power) {
            return 1;
        } else
            return 0;
    }
}