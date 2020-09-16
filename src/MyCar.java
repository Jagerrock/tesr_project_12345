public class MyCar extends Car {

    @Override
    void description() {

    }

    public static void main(String[] args) {
        MyCar Ferrari = new MyCar();
        Ferrari.gas(1);
        Ferrari.brake(1);
        Ferrari.description();
    }
}
