package decorator;

public abstract class BikeDecorator implements IBike{
    private IBike bike;

    public BikeDecorator(IBike bike) {
        this.bike = bike;
    }

    @Override
    public int getPrice() {
        return bike.getPrice()+getAddPrice();
    }

    protected abstract int getAddPrice();
}
