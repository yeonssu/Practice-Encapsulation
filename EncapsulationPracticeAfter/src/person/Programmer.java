package person;

import car.Car;

public class Programmer extends Person{
    private String company;
    private boolean tooMuchWork;
    public Programmer(String name, Car car, String company, boolean tooMuchWork) {
        super(name, car);
        this.company = company;
        this.tooMuchWork = tooMuchWork;
    }
    public void work(){
        System.out.println("근무를 시작합니다");
    }
    public void commute(){
        System.out.printf("%s를 타고 %s(으)로 출근합니다\n",super.getCar().getName(), company);
        super.drive();
        System.out.printf("%s에 도착했습니다\n",company);
    }
    @Override
    public void eat(){
        if (tooMuchWork) System.out.println("허겁지겁 밥을 먹습니다");
        else super.eat();
    }
    @Override
    public void sleep(){
        if (tooMuchWork) System.out.println("잠을 잘 수 없습니다");
        else super.sleep();
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.printf("%s에서 일하고 있으며, %s\n",company, tooMuchWork ? "오늘은 야근을 합니다" : "오늘은 야근을 하지 않습니다");
    }
}