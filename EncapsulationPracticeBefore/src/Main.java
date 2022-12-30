import car.Car;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        System.out.println("⭐️김예슬의 하루⭐️");
        Car bmw = new Car("BMW",50);
        Person yeseul = new Person("김예슬",bmw);

        yeseul.introduce();
        yeseul.eat();
        yeseul.drive();
        yeseul.sleep();

        System.out.println();
        System.out.println("⭐️이연수의 하루⭐️");

        Car lamborgini = new Car("람보르기니",100);
        Programmer yeonsu = new Programmer("이연수",lamborgini,"코드스테이츠",true);

        yeonsu.introduce();
        yeonsu.commute();
        yeonsu.work();
        yeonsu.eat();
        yeonsu.sleep();

        System.out.println();
        System.out.println("⭐️김지현의 하루⭐️");
        Car benz = new Car("벤츠", 50);
        Person jihyeon = new Programmer("김지현",benz,"파고다",false);
        jihyeon.introduce();
        jihyeon.eat();
        jihyeon.drive();
        jihyeon.sleep();
    }
}