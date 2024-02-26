package lesson_1;

import lesson_1.clients.Animal;
import lesson_1.clients.Lion;
import lesson_1.clients.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Leva", 77, LocalDate.now(), new Owner("Jack"));
        System.out.println(leva);
        System.out.println(leva.getType());
        System.out.println(leva.getName());
        leva.setWeight(88);
        System.out.println(leva.getWeight());
        Lion leva2 = new Lion();
        System.out.println(leva2);
        leva.liveCycle();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(leva);
        animalList.add(leva2);
        System.out.println(animalList);
    }
}
