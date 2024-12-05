package simpleapi.restapi.model;

public class Usermodel {
    private int id;
    private String name;
    private int age;
    private String email;

    public Usermodel(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
