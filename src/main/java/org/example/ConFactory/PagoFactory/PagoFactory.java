package org.example.ConFactory.PagoFactory;

import org.example.ConFactory.PagoInterface.Pago;
import org.example.ConFactory.TipoDePago.*;

import java.util.HashMap;
import java.util.Map;

public class PagoFactory {

    private final static Map<TipoDePago, Pago> pagos = new HashMap<>(){{
        put(TipoDePago.PAYPAL, new PagoPaypal());
        put(TipoDePago.TARJETA_CREDITO, new PagoTarjetaCredito());
        put(TipoDePago.TARJETA_DEBITO, new PagoTarjetaDebito());
        put(TipoDePago.TRANSFERENCIA_BANCARIA, new PagoTransferenciaBancaria());
        put(TipoDePago.BITCOIN, new PagoBitcoin());
        put(TipoDePago.EFECTIVO, new PagoEfectivo());
        put(TipoDePago.APPLE_PAY, new PagoApplePay());
        put(TipoDePago.GOOGLE_PAY, new PagoGooglePay());

    }};

    public Pago obtenerPago(TipoDePago tipoDePago) {
        return pagos.get(tipoDePago);
    }
}