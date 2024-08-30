package br.com.hpnda.veiculo; // pacote

public class Veiculo {
    // caracteristicas
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    //metodos
    public void acelerar() {
        System.out.println(modelo + "Acelerando");
    }

    public void freiar() {
        System.out.println(modelo + "Freiando");
    }
}
