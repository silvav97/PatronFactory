package org.example.SinFactory;

public class Main {
    public static void main(String[] args) {
        TipoDePago tipoDePago = TipoDePago.PAYPAL;

        if(tipoDePago == TipoDePago.PAYPAL) {
            hacerPagoPaypal();
        } else if (tipoDePago == TipoDePago.TARJETA_CREDITO) {
            hacerPagoTarjetaCredito();
        } else if (tipoDePago == TipoDePago.TARJETA_DEBITO) {
            hacerPagoTarjetaDebito();
        } else if (tipoDePago == TipoDePago.TRANSFERENCIA_BANCARIA) {
            hacerPagoTransferenciaBancaria();
        } else if (tipoDePago == TipoDePago.BITCOIN) {
            hacerPagoBitcoin();
        } else if (tipoDePago == TipoDePago.EFECTIVO) {
            hacerPagoEfectivo();
        } else if (tipoDePago == TipoDePago.APPLE_PAY) {
            hacerPagoApplePay();
        } else if (tipoDePago == TipoDePago.GOOGLE_PAY) {
            hacerPagoGooglePay();
        }
    }

    private static void hacerPagoPaypal(){
        System.out.println("Se hace pago con Paypal");
    }

    private static void hacerPagoTarjetaCredito(){
        System.out.println("Se hace pago con Tarjeta de Credito");
    }

    private static void hacerPagoTarjetaDebito(){
        System.out.println("Se hace pago con Tarjeta de Debito");
    }

    private static void hacerPagoTransferenciaBancaria(){
        System.out.println("Se hace pago con Transferencia Bancaria");
    }

    private static void hacerPagoBitcoin(){
        System.out.println("Se hace pago con Bitcoin");
    }

    private static void hacerPagoEfectivo(){
        System.out.println("Se hace pago con Efectivo");
    }

    private static void hacerPagoApplePay(){
        System.out.println("Se hace pago con Apple Pay");
    }

    private static void hacerPagoGooglePay(){
        System.out.println("Se hace pago con Google Pay");
    }
}