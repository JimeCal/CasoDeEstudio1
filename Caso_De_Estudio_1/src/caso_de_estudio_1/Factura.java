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
public class Factura {
    //Variables
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double montoFactura;
    private int numeroMes;
    private boolean electricos;
    private boolean automotrices;
    private boolean construccion;
    
    // Constructores de las variables
    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double montoFactura, int numeroMes, boolean contieneProductosElectricos, boolean contieneProductosAutomotrices, boolean contieneProductosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.numeroMes = numeroMes;
        this.electricos = contieneProductosElectricos;
        this.automotrices = contieneProductosAutomotrices;
        this.construccion = contieneProductosConstruccion;
    }
    // Emcapsuladores (Getters y Setters) de nombre del cliente
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    // Emcapsuladores (Getters y Setters) de cedula del cliente
    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    // Emcapsuladores (Getters y Setters) del codigo de factura
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
    // Emcapsuladores (Getters y Setters) del monto de factura
    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }
    // Emcapsuladores (Getters y Setters) de numero de mes
    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }
    // Emcapsuladores (Getters y Setters) de productos electricos
    public boolean getElectricos() {
        return electricos;
    }

    public void setElectricos(boolean electricos) {
        this.electricos = electricos;
    }
    // Emcapsuladores (Getters y Setters) de productos automotrices
    public boolean getAutomotrices() {
        return automotrices;
    }

    public void setAutomotrices(boolean automotrices) {
        this.automotrices = automotrices;
    }
    // Emcapsuladores (Getters y Setters) de productos construccion
    public boolean getConstruccion() {
        return construccion;
    }

    public void setConstruccion(boolean construccion) {
        this.construccion = construccion;
    }
}

