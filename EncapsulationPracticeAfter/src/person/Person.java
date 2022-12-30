package person;

import car.Car;

public class Person {
    private String name;
    private Car car;
    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public void eat(){
        System.out.printf("%s(이)가 밥을 먹습니다\n",name);
    }
    public void sleep(){
        System.out.printf("%s(이)가 잠을 잡니다\n",name);
    }
    public void introduce(){
        System.out.printf("안녕하세요 저는 %s입니다\n",name);
    }
    //Before : 이전에 작성한 drive()메서드는 캡슐화를 위반한다(결합도가 너무 높다)
    //Person클래스에서 car의 메서드를 다 알고 직접 작성하는 것보다 car관련된 메서드는 Car클래스에 작성하는 것이 객체의 자율성을 확보할 수 있다
    //캡슐화 = 객체의 자율성을 확보한다 = 결합도를 낮춘다 = 응집도를 높인다
    public void drive(){
        car.operate();
    }
}