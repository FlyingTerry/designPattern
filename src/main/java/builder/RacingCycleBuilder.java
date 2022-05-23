package builder;

public class RacingCycleBuilder extends BicycleBuilder{
    RacingCycle result;

    @Override
    public void buildBrake() {
        //公路车刹车
    }

    @Override
    public void buildFrame() {
        //公路车架
    }

    @Override
    public void buildHandlebars() {
        //公路车把
    }

    @Override
    public IBicycle getProduct() {
        return result;
    }
}
