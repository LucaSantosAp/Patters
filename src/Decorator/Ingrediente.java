/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Luciano
 */
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
