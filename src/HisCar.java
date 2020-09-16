import javax.net.ssl.HostnameVerifier;

public class HisCar implements CarInterface {

    @Override
    public void brake() {

    }

    @Override
    public void gas() {

    }

    @Override
    public void description() {

    }

    public static void main(String[] args) {
        HisCar Lada = new HisCar();
        Lada.brake();
        Lada.gas();
        Lada.description();
    }
}
