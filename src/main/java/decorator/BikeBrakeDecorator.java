package decorator;

public class BikeBrakeDecorator extends BikeDecorator{

    public BikeBrakeDecorator(IBike bike) {
        super(bike);
    }

    @Override
    protected int getAddPrice() {
        return 1000;
    }
}
