package animal;

public class Bird extends Animal {
    private String famale;
    private  String maxHightFly;

    public Bird(String famale, String maxHightFly,String color, String age, String eat,int numer,String form) {
        super(color,age,eat,numer,form);
        this.famale = famale;
        this.maxHightFly = maxHightFly;
    }

    public String getFamale() {
        return famale;
    }

    public void setFamale(String famale) {
        this.famale = famale;
    }

    public String getMaxHightFly() {
        return maxHightFly;
    }

    public void setMaxHightFly(String maxHightFly) {
        this.maxHightFly = maxHightFly;
    }

    public String sounds(){
        return famale+" Поёт";
    }
    public String toString() {
        return " семейство: "+famale+" максимальная высота полета: "+maxHightFly+" "+super.toString();
    }
}
