package car;

public class Car {
    private String name;
    private int fuelPercent;
    public Car() {
    }
    public Car(String name, int fuelPercent) {
        this.name = name;
        this.fuelPercent = fuelPercent;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFuelPercent() {
        return fuelPercent;
    }
    public void setFuelPercent(int fuelPercent) {
        this.fuelPercent = fuelPercent;
    }

    //캡슐화 : 외부 클래스에서 사용할 메서드를 private으로 만들고, 이를 연결할 수 있는 public메서드(operate메서드 같은)를 만들어 외부클래스에서 사용
    //자기가 수행해야하는 일을 자기가 가지고 있는 것이 좋다 -> 객체의 자율성을 확보할 수 있다
    //public->private
    private void on(){
        System.out.printf("%s에 시동을 겁니다\n",name);
    }
    //public->private
    private void go(){
        System.out.println("부릉부릉");
    }
    //public->private
    private void off(){
        System.out.printf("%s에 시동을 끕니다\n",name);
    }
    //Perons 클래스 drive()메서드에 있던 조건을 Car클래스에 적는 것이 객체의 자율성을 확보할 수 있다
    public void operate(){
        if (fuelPercent<=0){
            System.out.println("연료가 부족하여 시동을 걸 수 없습니다");
        } else {
            on();
            go();
            off();
        }
    }
}