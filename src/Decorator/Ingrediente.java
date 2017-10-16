
package Decorator;


public abstract class Ingrediente extends Sobremesa {
    protected Sobremesa sobremesa;
    protected String descricao;
    protected Double preco;
    
    public Ingrediente(Sobremesa sobremesa, String descricao, Double preco){
        this.sobremesa = sobremesa;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao(){
        return descricao + ", " + sobremesa.getDescricao();
    }
    
    @Override
    public Double getPreco(){
        return preco + sobremesa.getPreco();
    }
    
}
