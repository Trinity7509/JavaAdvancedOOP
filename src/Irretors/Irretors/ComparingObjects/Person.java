package Irretors.Irretors.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override

        public int compareTo(Person o){
            int comp = this.name.compareTo(o.name);
            if (comp == 0) {
                comp = Integer.compare(this.age, o.age);
                if (comp == 0) {
                    comp = this.town.compareTo(o.town);
                }
            }
            return comp;
        }

    }


