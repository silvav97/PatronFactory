package org.example.ConFactory.TipoDePago;

import org.example.ConFactory.PagoInterface.Pago;

public class PagoGooglePay implements Pago {

    @Override
    public void crearPago() {
        System.out.println("Se hace pago con GooglePay");
    }
}
