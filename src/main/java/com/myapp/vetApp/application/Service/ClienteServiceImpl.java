package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.ClienteDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final List<ClienteDTO> clientes = new ArrayList<>();

    @Override
    public List<ClienteDTO> listarClientes() {
        return clientes;
    }

    @Override
    public ClienteDTO crearCliente(ClienteDTO clienteDTO) {
        clientes.add(clienteDTO);
        return clienteDTO;
    }

    @Override
    public ClienteDTO actualizarCliente(ClienteDTO clienteDTO, long id) {
        return clienteDTO;
    }

    @Override
    public void eliminarCliente(long id) {
    }

    @Override
    public ClienteDTO buscarCliente(long id) {
        return null;
    }
}
