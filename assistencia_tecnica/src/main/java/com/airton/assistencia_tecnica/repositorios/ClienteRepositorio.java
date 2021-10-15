package com.airton.assistencia_tecnica.repositorios;

import com.airton.assistencia_tecnica.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {



}
