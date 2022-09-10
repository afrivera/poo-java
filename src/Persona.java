public class Persona {

    private String name;
    private String lastName;

    public Persona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
