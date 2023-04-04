package animal;

public class Main {
    public static void main(String[] args) {
        Animal jeri = new Dog("Джери", "чихуахуа", 5, "белый", "7", "сосиски", 1, " собака");
        Animal leva = new Lion("Лева", 55, "желтый", "15", "людей", 1, " лев");
        Animal chertila = new Lion("Чертила", 155, "коричневый", "35", "людей", 1, " лев");
        Animal zay = new Lion("Зая", 155, "коричневый", "35", "людей", 1, " лев");
        Animal petyh = new Bird("Петух", "1", "рыжий", "2", "зерно", 1, " птица");
        Zoopark zoo = new Zoopark();
        zoo.AddAnimals(petyh);
        zoo.AddAnimals(leva);
        zoo.AddAnimals(jeri);
        zoo.AddAnimals(chertila);
        zoo.AddAnimals(zay);
        zoo.addNumer();
        zoo.printAllAnimals();
        zoo.AllAnimalsVoice();


    }
}