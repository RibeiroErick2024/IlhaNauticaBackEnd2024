package com.example.testsa.dto.req;

import java.util.UUID;

public class UsuarioDTOReq {
    
    private UUID id;

    private String nomeCompleto;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
}
