public class Carro implements Veiculo {
    private final int portas;
    private final int rodas;

    public Carro(int portas, int rodas) {
        this.rodas = rodas;
        this.portas = portas;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar");
    }

    @Override
    public void frear() {
        System.out.println("Frear");
    }

    public void abrirPortas() {
        System.out.println("Abrir portas");
    }

    public void fecharPortas() {
        System.out.println("Fechar portas");
    }

    public static void main(String[] args) {
        Moto m = new Moto(2);

        m.acelerar();
        m.frear();
        m.empinar();
    }
}
