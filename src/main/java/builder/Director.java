package builder;

public class Director {
    BicycleBuilder builder;

    public Director(BicycleBuilder builder) {
        this.builder = builder;
    }

    public void constract(){
        builder.buildBrake();
        builder.buildFrame();
        builder.buildHandlebars();
    }
}
