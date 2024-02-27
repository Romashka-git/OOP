package lesson_1.clients;

import java.time.LocalDate;

// морж
public class Walrus extends Animal{
    public Walrus(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Walrus() {
        super();
    }


    @Override
    protected void fly() {
        System.out.println(getType() + " Are you crazy? I can't fly");
    }

    @Override
    protected void toGo() {
        System.out.println(getType() + " Ha-ha! I only know how to roll :D");
    }
}
