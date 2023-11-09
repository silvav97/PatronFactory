package org.example.ConFactory.TipoDePago;

import org.example.ConFactory.PagoInterface.Pago;

public class PagoTarjetaCredito implements Pago {

    @Override
    public void crearPago() {
        System.out.println("Se hace pago con Tarjeta de Credito");
    }
}
