package org.example.ConFactory.TipoDePago;

import org.example.ConFactory.PagoInterface.Pago;

public class PagoEfectivo implements Pago {

    @Override
    public void crearPago() {
        System.out.println("Se hace pago en Efectivo");
    }
}
