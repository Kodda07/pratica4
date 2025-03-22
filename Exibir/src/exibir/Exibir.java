
package exibir;

public class Exibir {

    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.modelo = "Corolla";
        carro.ano = 2018;
        carro.cor = "azul";
        
        System.out.println("o modelo do seu carro: " + carro.modelo);
        System.out.println("ano: "+ carro.ano);
        System.out.println("com cor: "+carro.cor);
                
        carro.Ligar();
        
        carro.Acelerar();
    }
    
}
