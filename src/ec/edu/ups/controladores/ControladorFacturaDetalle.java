/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erics
 */
public class ControladorFacturaDetalle {
    private Set<ec.edu.ups.modelo.FacturaDetalle> lista;
    private int numero;

    public int getCodigo() {
        return numero;
    }
    
    public ControladorFacturaDetalle() {
        lista = new HashSet<>();
        numero = 1;
    }
    
    public void create(ec.edu.ups.modelo.FacturaDetalle facturaDetalle){
        facturaDetalle.setCodigo(numero);
        numero++;
        lista.add(facturaDetalle);
    }
    
    public ec.edu.ups.modelo.FacturaDetalle read(int numero){
        for (ec.edu.ups.modelo.FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo()== numero){
                return facturaDetalle;
            }
        }
        return null;
    }
    
    public void update(ec.edu.ups.modelo.FacturaDetalle facturaDetalle){
        if(lista.contains(facturaDetalle)){
            lista.remove(facturaDetalle);
            lista.add(facturaDetalle);
        }
    }
    
    public void delete(int numero){
        for (ec.edu.ups.modelo.FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo()== numero){
                lista.remove(facturaDetalle);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (ec.edu.ups.modelo.FacturaDetalle facturaDetalle : lista) {
            System.out.println(facturaDetalle.getCodigo());
        }
    }
}
