package builder;

public class Main {
    public static void main(String[] args) {
        MountainBikeBuilder mountainBikeBuilder = new MountainBikeBuilder();
        Director director = new Director(mountainBikeBuilder);
        director.constract();
        IBicycle mountainBike = mountainBikeBuilder.getProduct();
    }
}
