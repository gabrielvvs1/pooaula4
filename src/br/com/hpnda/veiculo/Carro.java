package br.com.hpnda.veiculo;

public class Carro extends Veiculo{

    private int tamanhoPortaLuvas;
    private int qtdTapete;

    public Carro(String modelo, String marca, String cor, int portaLuvas, int qtdTapete) {
        super(modelo, marca, cor);
        this.tamanhoPortaLuvas = tamanhoPortaLuvas;
        this.qtdTapete = qtdTapete;
    }

    public void capota(){
        System.out.println("Capotando");
    }
}
