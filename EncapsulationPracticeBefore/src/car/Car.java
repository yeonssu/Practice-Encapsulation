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
    public void on(){
        System.out.printf("%s에 시동을 겁니다\n",name);
    }
    public void go(){
        System.out.println("부릉부릉");
    }
    public void off(){
        System.out.printf("%s에 시동을 끕니다\n",name);
    }
}
