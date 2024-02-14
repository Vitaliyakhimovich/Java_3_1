package main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy  implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Component... components) {
        for (Component c : components)
            this.components.add(c);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public String toString() {
        return String.format("Pharmacy components = " + components.size());
    }

    // Домашка
    @Override
    public int compareTo(Pharmacy o) {
        if (this.components.size() < o.components.size()) {
            return -1;
        } else if (this.components.size() > o.components.size()) {
            return 1;
        } else
            return 0;
    }
}
