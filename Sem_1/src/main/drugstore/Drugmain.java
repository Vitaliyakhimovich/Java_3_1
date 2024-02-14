package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component acid = new Azitronite("acid",20D, 14);
        Component penicillin = new Penicillin("penicillin",1.6, 6);
        // Начало первой части семмнара
//        Pharmacy p1 = new Pharmacy();
//        p1.addComponents(water, acid, penicillin);
//
//        Pharmacy2 p2 = new Pharmacy2();
//        p2.addComponents(water, acid);
//
//        Iterator <Component> iterator = p1;
//
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }
//
//        for (Component c : p2){
//            System.out.println(c);
//        }
        // Конец первой части семминара

        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, acid);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(water, penicillin, acid);

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(acid, penicillin);

        List<Pharmacy> pharmacy = new ArrayList<>();
        pharmacy.add(p1);
        pharmacy.add(p2);
        pharmacy.add(p3);
        System.out.println(pharmacy);

        Collections.sort(pharmacy);

        System.out.println(pharmacy);


//        List<Component> components = new ArrayList<>();
//        components.add(penicillin);
//        components.add(acid);
//        components.add(water);
//        System.out.println(components);
//
//        Collections.sort(components, Comparator.reverseOrder());
//        System.out.println(components);


    }
}
