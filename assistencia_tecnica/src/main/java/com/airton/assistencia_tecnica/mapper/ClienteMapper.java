package com.airton.assistencia_tecnica.mapper;

import com.airton.assistencia_tecnica.dto.ClienteDTO;
import com.airton.assistencia_tecnica.entidades.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO toDTO(Cliente c);

    Cliente toEntity(ClienteDTO clienteDTO);

    List<ClienteDTO> toListDTO(List<Cliente> list);


}
