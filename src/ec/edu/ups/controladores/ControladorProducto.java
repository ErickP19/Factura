/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erics
 */
public class ControladorProducto {
     private Set<Producto> lista;
    private int codigo;
    public ControladorProducto() {
        lista = new HashSet<>();
        codigo=0;
    }

    public int getCodigo() {
        return ++codigo;
    }
      
    //crear un num=evo objeto en la lista
    public void create(Producto objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public Producto read(int codigo){
        for (Producto entre : lista) {
            if (entre.getCodigo() == codigo) {
                return entre;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(Producto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (Producto entre : lista) {
            if (entre.getCodigo() == codigo){
                lista.remove(entre);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (Producto entre : lista) {
            System.out.println(entre.getNombre());
        }
    }
    
}
