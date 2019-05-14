/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author erics
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private Date fechacaducidad;
    private double precio;
    private Date fechaelaboracion;

    public Producto(int codigo, String nombre, String descripcion, Date fechacaducidad, double precio, Date fechaelaboracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechacaducidad = fechacaducidad;
        this.precio = precio;
        this.fechaelaboracion = fechaelaboracion;
    }
    

    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(Date fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaelaboracion() {
        return fechaelaboracion;
    }

    public void setFechaelaboracion(Date fechaelaboracion) {
        this.fechaelaboracion = fechaelaboracion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechacaducidad=" + fechacaducidad + ", precio=" + precio + ", fechaelaboracion=" + fechaelaboracion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        hash = 53 * hash + Objects.hashCode(this.fechacaducidad);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.fechaelaboracion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.fechacaducidad, other.fechacaducidad)) {
            return false;
        }
        if (!Objects.equals(this.fechaelaboracion, other.fechaelaboracion)) {
            return false;
        }
        return true;
    }
    

   
    
    
    
}
