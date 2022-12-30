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
    public void drive(){
        if(car.getFuelPercent()<=0){
            System.out.println("연료가 부족하여 시동을 걸 수 없습니다");
        } else {
            car.on();
            car.go();
            car.off();
        }
    }
}
