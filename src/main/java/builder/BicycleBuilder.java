package builder;

public abstract class BicycleBuilder {
    public void buildHandlebars(){};

    public void buildBrake(){};

    public void buildFrame(){};

    public abstract IBicycle getProduct();
}
