package com.agrojm.facturacionelectronica.dominio.excepcion;

public class ClientException extends RuntimeException{
    private static final Long serialVerionUID = 1L;

    public ClientException(String mensaje){
        super(mensaje);
    }
}
