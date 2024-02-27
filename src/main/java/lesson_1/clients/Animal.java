package lesson_1.clients;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public Animal () {
        this("Animal", 0, LocalDate.now(), new Owner("Name"));
    }

    private void sleep() {
        System.out.println(getType() + " " + getName() + " sleep...");
    }

    private void wakeUp() {
        System.out.println(getType() + " wake up!");
    }
    private void wakeUp(int time) {
        System.out.println(getType() + " wake up at " + time);
    }

    private void eat() {
        System.out.println(getType() + " eat :)");
    }

    protected void toGo() {
        System.out.println(getType()  + " going!");
    }

    protected void fly() {
        System.out.println(getType() + " flying =)");
    }
    protected void swim() {
        System.out.println(getType() + " swimming! Blop-blop");
    }

    public void liveCycle() {
        wakeUp();
        wakeUp(5);
        eat();
        toGo();
        fly();
        swim();
        sleep();
        System.out.println("--------------");
    }

    public String getType(){
        return getClass().getSimpleName();
    }


    @Override
    public String toString() {
        return String.format("Name = %s, weight = %s, age = %s, owner = %s", name, weight, age, owner);
    }
}
