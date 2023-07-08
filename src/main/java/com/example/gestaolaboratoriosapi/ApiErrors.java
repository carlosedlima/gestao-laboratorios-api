package com.example.gestaolaboratoriosapi;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {
    @Getter
    private final List<String> errors;

    public ApiErrors(String mensagem){
        this.errors = Arrays.asList(mensagem);
    }
}