package animal;

public class Lion extends Animal {
    private String name;

    private int weight;

    public Lion(String name, int weight, String color, String age, String eat, int numer,String form) {
        super(color, age, eat, numer, form);
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String sounds() {
       return name+ " Рычит";
    }
    public String toString(){
        return "Имя: "+name+" Вес: "+weight+" "+super.toString();
    }
}
