
package exibir;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;
    public boolean ligado = false;
    
    public void Ligar(){
     ligado = true ;
        System.out.println("O carro ligou");
    } 
       public void Desligar(){
     ligado = false ;
             System.out.println("O carro desligou");
    } 
    
    public void Acelerar()
    { 
        if(ligado)
        {
            System.out.println("o carro está acelerando");
        }
        else 
        {
            System.out.println("o carro está desligado, logo nao acelera");
       }
     
    }

}

