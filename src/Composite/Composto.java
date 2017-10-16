
package Composite;


public class Composto implements Produto{
    private Produto produto1;
    private Produto produto2;
    
    public Composto(Produto produto1, Produto produto2){
        this.produto1 = produto1;
        this.produto2 = produto2;
    }
    
    @Override
    public String getNome() {
        return produto1.getNome()+" junto com "+produto2.getNome();
    }

    @Override
    public Double getPreco() {
        return produto2.getPreco()+produto1.getPreco();
    }
    
}
