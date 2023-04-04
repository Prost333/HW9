package animal;

public class Zoopark {
    private Animal[] animals;
    private int nextnumber;

    public Zoopark(Animal[] animals, int nextnumber) {
        this.animals = animals;
        this.nextnumber = nextnumber;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNextnumber() {
        return nextnumber;
    }

    public void setNextnumber(int nextnumber) {
        this.nextnumber = nextnumber;
    }

    public Zoopark() {
        animals = new Animal[6];
        nextnumber=1;

        animals[0]=new Dog("Рекс", "овчарка", 15,"Белая", "18","говно",1," собака");
        animals[1]= new Dog("Кабочок", "Щпиц", 7,"Серая", "5","котов",1," собака");
        animals[2]= new Dog("Тузик", "Алабай", 10,"Черная", "10","мясо",1," собака");
        animals[3]=new Bird("feda","50","green","2","bread",1," птица");
        animals[4]=new Bird("тоша","70","пернатый","5","лягушек",1," птица");
        animals[5]=new Bird("Гоша","5","розовый","1","зерно",1," птица");
    }

    public  void addNumer (){
        for (int i=0;i<animals.length;i++){
            if (animals[i]!=null){
                animals[i].setNumer(nextnumber);
                nextnumber++;
            }
        }
    }

    public  void printAllAnimals(){
        for (int i=0;i<animals.length;i++){
            if (animals[i]!=null){
                System.out.println(animals[i].toString());
            }
        }
    }

    public  void AllAnimalsVoice (){
        for (int i=0;i<animals.length;i++){
            if (animals[i]!=null){
                System.out.println(animals[i].sounds());
            }
        }
    }


    public void AddAnimals(Animal animal){
        int numberOfAnimals=animals.length;
        if (numberOfAnimals==0){
            animals=new Animal[1];
            animals[0]=animal;
        }else{
            Animal[] copyOfAnimal= new Animal[animals.length+1];
            for (int i =0; i< animals.length;i++){
                if (i!=animals.length) {
                    copyOfAnimal[i] = animals[i];
                }else {
                    copyOfAnimal[i]=animal;
                }
            }
        animals=copyOfAnimal;
        for (int b=0;b<animals.length;b++){
        if (copyOfAnimal[b]==null){
            copyOfAnimal[b]=animal;
        }
        }

        }}



}
