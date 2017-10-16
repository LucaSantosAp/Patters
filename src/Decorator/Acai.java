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
public class Acai extends Sobremesa {

    @Override
    public String getDescricao() {
        return "Açai";
    }

    @Override
    public Double getPreco() {
        return 5.00;
    }
    
}
