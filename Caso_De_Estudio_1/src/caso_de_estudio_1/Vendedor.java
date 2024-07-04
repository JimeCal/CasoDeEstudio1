/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_de_estudio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author bague
 */
public class Vendedor {
    //Variables
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean tieneVehiculo;

    // Constructores de las variables
    public Vendedor(String nombre, String cedula, String codigo, String sucursal, boolean tieneVehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.tieneVehiculo = tieneVehiculo;
    }

    // Emcapsuladores (Getters y Setters) de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Emcapsuladores (Getters y Setters) de cedula
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    // Emcapsuladores (Getters y Setters) de codigo
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    // Emcapsuladores (Getters y Setters) de surcurlas
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    // Emcapsuladores (Getters y Setters) de vehiculo
    public boolean getTieneVehiculo() {
        return tieneVehiculo;
    }

    public void setTieneVehiculo(boolean tieneVehiculo) {
        this.tieneVehiculo = tieneVehiculo;
    }   
}
