
package trabalhoanalisepatterns;

import Composite.Composto;
import Composite.Produto;
import Composite.Simples;
import Decorator.Granola;
import Decorator.Sobremesa;
import Decorator.Ninho;
import Decorator.Sobremesa;
import Template.Pedido;
import Template.Preparando;
import Decorator.Acai;
import Observer.Cliente;
import Observer.PedidoAcai;
import Template.Pronto;


public class TrabalhoAnalisePatterns {

    
    public static void main(String[] args) {
        
        Pedido p = new Preparando();
        p.selecionando();
        
        Sobremesa acai = new Acai();
        acai = new Ninho(acai);
        acai = new Granola(acai);
        System.out.println("O seu produto é: " + acai.getDescricao());
        
        Produto pedido = new Simples("acai ", 7.5d);
        Produto refrigerante = new Simples("Refrigerante ", 3.5d);
        Produto kit = new Composto(pedido, refrigerante);
              
        System.out.println(pedido.getNome() + pedido.getPreco());
        System.out.println(refrigerante.getNome() + refrigerante.getPreco());
        System.out.println(kit.getNome() + kit.getPreco());
        
        p.modoDePreparo();
        p.calcular();
        
        System.out.println("Você deve pagar: 11.0");
        
        PedidoAcai pa = new PedidoAcai();
        pa.addObservador(new Cliente());
        pa.setPedidoAcai("Pedido esta sendo processado.");
        
        Pedido p2 = new Pronto();
        p2.modoDePreparo();
        
    }
    
}
