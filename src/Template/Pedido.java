
package Template;


public abstract class Pedido {
    public void Pedido(){
        
        selecionando();
        modoDePreparo();
        calcular();
    }
    
    public void selecionando(){
        System.out.println("Buscando itens...");
    }
    public abstract void modoDePreparo();
    
    public void calcular(){
        System.out.println("calculando Total...");
    }
   
    
}
    

