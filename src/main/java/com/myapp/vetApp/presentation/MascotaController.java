package com.myapp.vetApp.presentation;


import com.myapp.vetApp.application.DTO.MascotaDTO;
import com.myapp.vetApp.application.Service.MascotaService;
import lombok.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    private final MascotaService mascotaService;


    @GetMapping
    public List<MascotaDTO> listarMascotas() {
        return mascotaService.listarMascotas();
    }

    @PostMapping
        public MascotaDTO crearMascota(@RequestBody MascotaDTO mascotaDTO) {
        return mascotaService.crearMascota(mascotaDTO);
    }

    @PutMapping("/{id}")
    public MascotaDTO actualizarCliente(@PathVariable Long id, @RequestBody MascotaDTO mascotaDTO){
        return mascotaService.actualizarMascota(mascotaDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMascota(@PathVariable Long id) {
        mascotaService.eliminarMascota(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public MascotaDTO buscarMascota(@PathVariable Long id) {
        return mascotaService.buscarMascota(id);
    }

    @GetMapping("/pruebita")
    public String pruebita(){
        return "Está funcionando Mascota vv :D";
    }

}