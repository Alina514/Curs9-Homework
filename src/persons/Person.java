package persons;

public class Person {
    private String name;
    private Integer age;
   public String position;

    public Person(String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
}
