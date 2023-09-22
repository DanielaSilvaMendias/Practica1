import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class Articulos {
    private String id;
    private String nombre;
    private String codigoBarras;
    private Double precio;
    private Integer existencia;

    public Articulos(String id, String nombre, String codigoBarras, Double precio, Integer existencia) {
        this.id = id;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Articulos() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", precio=" + precio +
                ", existencia=" + existencia +
                '}';
    }


}
