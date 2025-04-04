package com.myapp.vetApp.presentation;

import com.myapp.vetApp.application.DTO.CitaDTO;
import com.myapp.vetApp.application.Service.CitaService;
import lombok.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
@RestController
@RequestMapping("/citas")
public class CitaController {

    private final CitaService citaService;


    @GetMapping
    public List<CitaDTO> listarCitas() {
        return citaService.listarCitas();
    }

    @GetMapping("/{id}")
    public CitaDTO buscarCita(@PathVariable Long id) {
        return citaService.buscarCita(id);
    }

    @PostMapping
    public CitaDTO crearCita(@RequestBody CitaDTO citaDTO) {
        return citaService.crearCita(citaDTO);
    }

    @PutMapping("/{id}")
    public CitaDTO actualizarCita(@PathVariable Long id, @RequestBody CitaDTO citaDTO){
        return citaService.actualizarCita(citaDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCita(@PathVariable Long id) {
        citaService.eliminarCita(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/pruebita")
    public String pruebita(){
        return "Está funcionando Citas vv :D";
    }
}
