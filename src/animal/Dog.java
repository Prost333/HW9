package animal;

public class Dog extends Animal {
    private String name;
    private String type;
    private int medoumWeigh;

    public Dog(String name, String type, int medoumWeigh, String color, String age, String eat, int numer,String form) {
        super(color, age, eat, numer,form);
        this.name = name;
        this.type = type;
        this.medoumWeigh = medoumWeigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMedoumWeigh() {
        return medoumWeigh;
    }

    public void setMedoumWeigh(int medoumWeigh) {
        this.medoumWeigh = medoumWeigh;
    }

    public String sounds() {
        return name+ " Гавкает";
    }

    public String toString() {
        return "имя " + name + " порода " + type + " вес " + medoumWeigh+" " + super.toString();
    }
}
