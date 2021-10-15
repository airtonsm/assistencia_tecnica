package com.airton.assistencia_tecnica.recursos;

import com.airton.assistencia_tecnica.entidades.Cliente;
import com.airton.assistencia_tecnica.servicos.ClienteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteRecurso {

    @Autowired
    private ClienteServico servico;

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
        Cliente novocliente = servico.salvar(cliente);
        return ResponseEntity.ok().body(novocliente);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos(){
        List<Cliente> clientes = servico.listarTodos();
        return ResponseEntity.ok().body(clientes);
    }

}
