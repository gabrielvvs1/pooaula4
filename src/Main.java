import br.com.hpnda.veiculo.Carro;
import br.com.hpnda.veiculo.Moto;

public class Main {
    public static void main(String[] args) {

        Carro objcarro = new Carro("Tesla","Cyber Truck","Chumbo",50,5);
        objcarro.acelerar();
        objcarro.freiar();
        objcarro.capota();

        System.out.println("=============================");

        Moto objMoto = new Moto("BMW","B1000","Branca","Titanio","CR288");
        objMoto.acelerar();
        objMoto.freiar();
        objMoto.cai();
    }

}