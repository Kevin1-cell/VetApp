package com.myapp.vetApp.presentation;

import com.myapp.vetApp.application.DTO.ClienteDTO;
import com.myapp.vetApp.application.Service.ClienteService;
import lombok.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;


    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.listarClientes();
    }

    @PostMapping
    public ClienteDTO crearCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.crearCliente(clienteDTO);
    }

    @PutMapping("/{id}")
    public ClienteDTO actualizarCliente(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO){
        return clienteService.actualizarCliente(clienteDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCita(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ClienteDTO buscarCliente(@PathVariable Long id) {
        return clienteService.buscarCliente(id);
    }

    @GetMapping("/pruebita")
    public String pruebita(){
        return "Está funcionando Clientes vv :D";
    }
}
