package decorator;

public class Main {
    public static void main(String[] args) {
        IBike bike = new Bike();
        System.out.println("质朴价格："+bike.getPrice());
        bike = new BikeBrakeDecorator(bike);
        System.out.println("换刹车价格："+bike.getPrice());
        bike = new BikeFrameDecorator(bike);
        System.out.println("换车架价格："+bike.getPrice());
    }
}
