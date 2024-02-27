package lesson_1.clients;

import java.time.LocalDate;

public class Griffin extends Animal{
    public Griffin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Griffin() {
        super();
    }

    @Override
    protected void toGo() {
        System.out.println(getType() + " I can jump on the spot..");
    }

    @Override
    protected void swim() {
        System.out.println(getType() + " Who do you think I am?");
    }
}
