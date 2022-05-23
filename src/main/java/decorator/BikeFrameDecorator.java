package decorator;

public class BikeFrameDecorator extends BikeDecorator{
    public BikeFrameDecorator(IBike bike) {
        super(bike);
    }

    @Override
    protected int getAddPrice() {
        return 7000;
    }
}
