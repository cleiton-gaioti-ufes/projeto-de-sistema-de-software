public class Moto implements Veiculo {
    private final int rodas;

    public Moto(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera");
    }

    @Override
    public void frear() {
        System.out.println("Frear");
    }

    public void empinar() {
        System.out.println("Olha o grau");
    }
}
