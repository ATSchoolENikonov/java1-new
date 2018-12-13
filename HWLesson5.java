import java.util.Arrays;

public class HWLesson5 {
    public static void main (String args []){
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "891212121", 30000, 30);
        persArray[1] = new Person("Sergeev sergey","Knight","bananaknight123@box.ru","894455454",40000,22);
        persArray[2] = new Person("Sergeev Ivan","Manager lvl1","manager123@box.ru","895555555",38000,42);
        persArray[3] = new Person("Molotov Ivan","Manager lvl2","manager12345@box.ru","89666666",40000,41);
        persArray[4] = new Person("Kovalev Alexey","Manager lvl3","managertop@box.ru","895777777",45000,27);
        for (int i=0;i<persArray.length;i++)
            if (persArray[i].age>40)
                persArray[i].print();



    }
}
class Person {
    private String name;
     String position;
     String email;
     String phone;
    int cash;
     int age;
     @Override
     public String toString(){
         return "Name: "+ getName() + " Position: " + this.position + " Email: " + this.email + " Phone:" + this.phone + " Cash: " + this.cash + " Age: " + this.age;
     }


    public Person(String name, String position, String email, String phone, int cash, int age) {
        this.name=name;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.cash=cash;
        this.age=age;

    }
    public void print(){
        System.out.println(this);
    }
     String getName(){

        return name;
    }
}