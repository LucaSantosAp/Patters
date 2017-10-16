
package Composite;


public class Simples implements Produto{
    private String nome;
    private Double preco;
    
    public Simples(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }
}
