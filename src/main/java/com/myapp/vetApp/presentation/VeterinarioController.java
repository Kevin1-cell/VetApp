package com.myapp.vetApp.presentation;


import com.myapp.vetApp.application.DTO.VeterinarioDTO;
import com.myapp.vetApp.application.Service.VeterinarioService;
import lombok.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    private final VeterinarioService veterinarioService;


    @GetMapping
    public List<VeterinarioDTO> listarVeterinarios() {
        return veterinarioService.listarVeterinarios();
    }

    @GetMapping("/{id}")
    public VeterinarioDTO buscarVeterinario(@PathVariable Long id) {
        return veterinarioService.buscarVeterinario(id);
    }

    @PostMapping
    public VeterinarioDTO crearVeterinario(@RequestBody VeterinarioDTO veterinarioDTO) {
        return veterinarioService.crearVeterinario(veterinarioDTO);
    }

    @PutMapping("/{id}")
    public VeterinarioDTO actualizarVeterinario(@PathVariable Long id, @RequestBody VeterinarioDTO veterinarioDTO){
        return veterinarioService.actualizarVeterinario(veterinarioDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVeterinario(@PathVariable Long id) {
        veterinarioService.eliminarVeterinario(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/pruebita")
    public String pruebita(){
        return "Está funcionando Veterinario wuao wuao :D";
    }
}

