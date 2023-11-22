package com.mycompany.manejocuenta;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Cuenta {
    private String numcuenta;
    private float saldo;
    private String historialtrans;
    private String moneda;

public Cuenta(String numcuenta,float saldo, String historialtrans, String moneda) {
this.numcuenta = numcuenta;
this.saldo = saldo;
this.historialtrans = historialtrans;
this.moneda = moneda;
}
public String getNumcuenta(){
    return numcuenta;
}
public float getSaldo(){
    return saldo;
}
public String getHistorialtrans(){
    return historialtrans;
}
public String getMoneda(){
    return moneda;
}
    public static String ingresarNumeroCuenta() {
        return JOptionPane.showInputDialog("Ingrese el número de cuenta:");
    }

  
    public static float ingresarSaldoInicial() {
        return Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));
    }

  
    public static String ingresarHistorialTransacciones() {
        return JOptionPane.showInputDialog("Ingrese el historial de transacciones:");
    }

 
    public static String ingresarTipoMoneda() {
        return JOptionPane.showInputDialog("Ingrese el tipo de moneda:");
    }
     public static Cuenta ingresarDatosCuenta() {
        String numCuenta = ingresarNumeroCuenta();
        float saldo = ingresarSaldoInicial();
        String historialTransacciones = ingresarHistorialTransacciones();
        String moneda = ingresarTipoMoneda();
        return new Cuenta(numCuenta, saldo, historialTransacciones, moneda);
    }
     public void imprimeDatosCuenta(){
     JOptionPane.showMessageDialog(null, "Numero de la cuenta"+getNumcuenta()+"\nSaldo de la Cuenta "+getSaldo()+" "+getMoneda()+"\nHistorial de transacciones"+getHistorialtrans()+"\nMoneda+ "+getMoneda());
     }
} 
