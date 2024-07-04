/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_de_estudio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author bague
 */
public class Caso_De_Estudio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se solicitan los datos del vendedor
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente vendedor:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente vendedor:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente vendedor:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del agente vendedor:");
        boolean tieneVehiculoPropio = JOptionPane.showConfirmDialog(null, "¿Tiene vehículo propio?", "Vehículo Propio", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        // Se guardan los datos del venderdor
        Vendedor vendedor = new Vendedor(nombre, cedula, codigo, sucursal, tieneVehiculoPropio);

        // Se solicita la catidad de facturas
        int numFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de facturas:"));
        Factura[] facturas = new Factura[numFacturas];
        //Dependiendo del numero de facturas ingresadas es la cantidad de veces que se le va a preguntar la informacion del cliente
        for (int i = 0; i < numFacturas; i++) {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de la factura:");
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes de la factura:"));
            boolean productosElectricos = JOptionPane.showConfirmDialog(null, "¿Incluye productos eléctricos?", "Productos Eléctricos", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productosAutomotrices = JOptionPane.showConfirmDialog(null, "¿Incluye productos automotrices?", "Productos Automotrices", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productosConstruccion = JOptionPane.showConfirmDialog(null, "¿Incluye productos de construcción?", "Productos de Construcción", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

            // Guarda la informacion de factura con los datos ingresados
            facturas[i] = new Factura(nombreCliente, cedulaCliente, codigoFactura, montoFactura, mes, productosElectricos, productosAutomotrices, productosConstruccion);

            // Muestra los detalles de la factura por cliente
            JOptionPane.showMessageDialog(null, "Factura " + (i + 1) + ":\n" +
                "Nombre Cliente: " + nombreCliente + "\n" +
                "Cédula Cliente: " + cedulaCliente + "\n" +
                "Código Factura: " + codigoFactura + "\n" +
                "Monto Factura: " + montoFactura + "\n" +
                "Mes: " + mes + "\n" +
                "Productos Eléctricos: " + (productosElectricos ? "Sí" : "No") + "\n" +
                "Productos Automotrices: " + (productosAutomotrices ? "Sí" : "No") + "\n" +
                "Productos de Construcción: " + (productosConstruccion ? "Sí" : "No") + "\n");
        }
        // Se llaman las comisiones y puntos del vendedor 
        double comisionTotal = ComisionPuntos.calcularComisionTotal(facturas);
        int puntosTotales = ComisionPuntos.calcularPuntosTotales(facturas);
        
        // Muestra la informacion del vendedor
        JOptionPane.showMessageDialog(null, "Información del vendedor:\n" +
                "Nombre: " + vendedor.getNombre() + "\n" +
                "Cédula: " + vendedor.getCedula() + "\n" +
                "Código: " + vendedor.getCodigo() + "\n" +
                "Sucursal: " + vendedor.getSucursal() + "\n" +
                "Vehículo Propio: " + (vendedor.getTieneVehiculo()? "Sí" : "No") + "\n" +
                "Comisión Total: " + comisionTotal + "\n" +
                "Puntos Totales: " + puntosTotales);
        }
    }
