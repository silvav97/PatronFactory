package org.example.ConFactory;

import org.example.ConFactory.PagoInterface.Pago;
import org.example.ConFactory.PagoFactory.PagoFactory;
import org.example.ConFactory.PagoFactory.TipoDePago;

public class Main {
    public static void main(String[] args) {
        PagoFactory pagoFactory = new PagoFactory();
        Pago pago = pagoFactory.obtenerPago(TipoDePago.EFECTIVO);
        pago.crearPago();
    }
}
