package Irretors.Irretors.ComparingObjects.StrategyPattern;

public class Person {
    private String name;
    private int age;
    private int number;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(this.name.length()<1||this.name.length()>50)
        {
            throw new IllegalArgumentException("No name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (this .age<=1||this.age>=100)
        {
            throw new IllegalArgumentException("No age");
        }
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        if(this.number<=0||this.number>=100)
        {
            throw new IllegalArgumentException("No number");
        }
        this.number = number;
    }
}
