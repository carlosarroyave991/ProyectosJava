package com.agrojm.facturacionelectronica.dominio.excepion;

public class SaleException extends RuntimeException{
    private static final Long serialVerionUID = 1L;

    public SaleException(String mensaje){
        super(mensaje);
    }
}
