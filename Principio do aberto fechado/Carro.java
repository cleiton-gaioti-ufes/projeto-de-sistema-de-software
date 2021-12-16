import java.nio.file.attribute.AclEntry;

public class Carro implements Veiculo {

    @Override
    public void acelera() {/*...*/}

    public static class Moto implements Veiculo {
        @Override
    public void acelera() {/*...*/}
    }

    public static class Bicicleta implements Veiculo {
        @Override
    public void acelera() {/*...*/}
    }

    public static class Aviao implements Veiculo {
        @Override
    public void acelera() {System.out.println("Vruuum");}
    }

    public static class Navio implements Veiculo {
        @Override
    public void acelera() {/*...*/}
    }

    public static void acelerar(Veiculo veiculo) {
        veiculo.acelera();
    }

    public static void main(String[] args) {
        acelerar(new Aviao());
    }
}
