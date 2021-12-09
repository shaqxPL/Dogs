public class Dog {

    String name;
    String breed;
    int age;

    //to jest konstruktor bez parametrowy
    public Dog(){
    }



    //konstruktor domyslny z wartoscami
//    public Dog(){
//        name = "azor";
//        breed = "kundel";
//        age = 3;
//    }

    //konstruktor parametrowy
    public Dog(String name,String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(String breed){
        this.breed = breed;
    }















    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
