package com.airton.assistencia_tecnica.servicos;

import com.airton.assistencia_tecnica.dto.ClienteDTO;
import com.airton.assistencia_tecnica.entidades.Cliente;
import com.airton.assistencia_tecnica.mapper.ClienteMapper;
import com.airton.assistencia_tecnica.repositorios.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServico {

    @Autowired
    private ClienteRepositorio repositorio;

    public Cliente salvar(Cliente cliente){
       return repositorio.save(cliente);

    }

    public List<Cliente> listarTodos(){
        List<Cliente> lista = repositorio.findAll();
        return lista;
    }

}
