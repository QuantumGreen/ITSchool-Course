package session4;

import java.util.Objects;

public class Animal {
    public String name;
    public int age;
    private double weight;
    private boolean isWild;
    private String sex;
    private String diet;
    private String color;
    private String animalType;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && isWild == animal.isWild && Objects.equals(name, animal.name) && Objects.equals(sex, animal.sex) && Objects.equals(diet, animal.diet) && Objects.equals(color, animal.color) && Objects.equals(animalType, animal.animalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, isWild, sex, diet, color, animalType);
    }

    public String getName(){
        return name;
    }
    public void setName(String _name){
        name = _name;
    }

}
