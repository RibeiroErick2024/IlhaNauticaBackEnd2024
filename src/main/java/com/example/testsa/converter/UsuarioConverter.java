package com.example.testsa.converter;

import java.util.List;

import com.example.testsa.dto.req.Usuario.CadastroUsuarioDTO;
import com.example.testsa.dto.res.Embarcacao.EmbarcacaoDTORes;
import com.example.testsa.dto.res.Marinheiro.MarinheiroDTORes;
import com.example.testsa.dto.res.Usuario.UsuarioGeralDTORes;
import com.example.testsa.dto.res.Usuario.UsuarioLocadorDTORes;
import com.example.testsa.dto.res.Usuario.UsuarioSimplesDTO;
import com.example.testsa.entities.Usuario;

public interface UsuarioConverter {
    
    public static UsuarioSimplesDTO usuarioConverterSimples(Usuario entity){
        UsuarioSimplesDTO dto = new UsuarioSimplesDTO();
        dto.setId(entity.getId());
        dto.setNomeCompleto(entity.getNomeCompleto());
        
        return dto;
    }
    public static UsuarioLocadorDTORes usuarioConverterLocador(Usuario entity){
        UsuarioLocadorDTORes all = new UsuarioLocadorDTORes();
        all.setId(entity.getId());
        all.setNomeCompleto(entity.getNomeCompleto());
        all.setCpf(entity.getCpf());
        all.setDataNascimento(entity.getDataNascimento());
        all.setGenero(entity.getGenero());

        List<MarinheiroDTORes> listaMarinheiros = entity.getMarinheiro()
        .stream().map(a -> MarinheiroConverter.entidadeParaMarinheiroDTO(a)).toList();

        all.setMarinheiro(listaMarinheiros);
        List<EmbarcacaoDTORes> listaEmbarcacao = entity.getEmbarcacao()
        .stream().map(a -> EmbarcacaoConverter.embarcacaoConverterDTO(a)).toList();

        all.setEmbarcacao(listaEmbarcacao);

        return all;
    }

    public static UsuarioGeralDTORes usuarioConverterGeral(Usuario entity){
        UsuarioGeralDTORes all = new UsuarioGeralDTORes();
        all.setId(entity.getId());
        all.setNomeCompleto(entity.getNomeCompleto());
        all.setCpf(entity.getCpf());
        all.setDataNascimento(entity.getDataNascimento());
        all.setGenero(entity.getGenero());

        return all;
    }

       public static Usuario cadastroDTOConverterUsuario(CadastroUsuarioDTO criarUsuario){
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNomeCompleto(criarUsuario.getNomeCompleto());
        novoUsuario.setEmail(criarUsuario.getEmail());
        novoUsuario.setSenha(criarUsuario.getSenha());

        return novoUsuario;  
    }

   
}

