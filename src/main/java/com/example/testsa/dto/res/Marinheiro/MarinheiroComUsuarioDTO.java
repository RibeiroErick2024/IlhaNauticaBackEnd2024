package com.example.testsa.dto.res.Marinheiro;

import java.util.UUID;

import com.example.testsa.dto.res.Usuario.UsuarioSimplesDTO;

public class MarinheiroComUsuarioDTO{

    private UUID id_marinheiro;

    private String categoria;

    private String registroMaritimo;

    private String disponibilidade;

    private int anosExperiencia;

    private UsuarioSimplesDTO usuario;

    public UUID getId_marinheiro() {
        return id_marinheiro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRegistroMaritimo() {
        return registroMaritimo;
    }

    public void setRegistroMaritimo(String registroMaritimo) {
        this.registroMaritimo = registroMaritimo;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }


    public void setId_marinheiro(UUID id_marinheiro) {
        this.id_marinheiro = id_marinheiro;
    }

    public UsuarioSimplesDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioSimplesDTO usuario) {
        this.usuario = usuario;
    }

}
