package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    List<ClienteDTO> listarClientes();

    ClienteDTO crearCliente(ClienteDTO clienteDTO);
    ClienteDTO actualizarCliente(ClienteDTO clienteDTO, long id);
    void eliminarCliente(long id);
    ClienteDTO buscarCliente(long id);
}
