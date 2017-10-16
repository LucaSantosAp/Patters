
package Observer;


public class Cliente implements Observador {

    @Override
    public void notificar() {
        System.out.println("Cliente notificado que seu pedido foi concluido!");
    }
    
}
