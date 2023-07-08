package com.example.gestaolaboratoriosapi.exceptions;

public class RegraNegocioException extends RuntimeException {
    public RegraNegocioException(String mensagem){
        super(mensagem);
    }
}
