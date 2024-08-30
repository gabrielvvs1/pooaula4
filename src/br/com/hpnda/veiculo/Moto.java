package br.com.hpnda.veiculo;

public class Moto extends Veiculo{

    private String materialPeDeDescanso;
    private String modeloGuidao;

    public Moto(String modelo, String marca, String cor, String materialPeDeDescanso, String modeloGuidao) {
        super(modelo, marca, cor);
        this.materialPeDeDescanso = materialPeDeDescanso;
        this.modeloGuidao = modeloGuidao;
    }

    public void cai(){
        System.out.println("caindo...");
    }
}

