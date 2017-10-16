
package Observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoAcai {
    
    private String pedidoAcai;
    private List<Observador> observadores = new ArrayList<>();
    
    public void setPedidoAcai(String pedidoAcai){
        this.pedidoAcai = pedidoAcai;
        for(Observador observador:observadores){
            observador.notificar();
        }
    }
    public void addObservador(Observador observador){
        this.observadores.add(observador);
    }

    
}

