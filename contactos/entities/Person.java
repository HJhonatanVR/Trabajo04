package entities;

public class Person {
    int id;
    String name;
    char sex='M';
    int age;

    public Person() {
    }
    
    public Person(String name, char sex, int age) {
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public void laugh() {
        System.out.println( name + " jejeje!");
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
