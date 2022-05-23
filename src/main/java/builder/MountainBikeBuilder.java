package builder;

public class MountainBikeBuilder extends BicycleBuilder{
    MountainBike result;

    @Override
    public void buildHandlebars() {
        //山地车车把
    }

    @Override
    public void buildFrame() {
        //山地车架
    }

    @Override
    public void buildBrake() {
        //山地车刹车
    }

    @Override
    public IBicycle getProduct() {
        return result;
    }
}
