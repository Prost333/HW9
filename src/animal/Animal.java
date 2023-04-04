package animal;

public abstract class Animal {
    private String form;
    private String color;
    private  String age;
    private  String eat;
    private  int numer;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Animal(String color, String age, String eat, int numer, String form) {
        this.color = color;
        this.age = age;
        this.eat = eat;
        this.numer= this.numer;
        this.form=form;
    }
    public abstract String sounds();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }
    public String toString(){
        return "цвет: "+color+" возраст: "+age+" что едят: "+eat+" номер: "+numer+" животное: "+form;}


}
