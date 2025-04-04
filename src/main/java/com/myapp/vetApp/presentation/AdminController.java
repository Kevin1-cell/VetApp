package com.myapp.vetApp.presentation;

import com.myapp.vetApp.application.DTO.AdminDTO;
import com.myapp.vetApp.application.Service.AdminService;
import lombok.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminService adminService;


    @GetMapping
    public List<AdminDTO> listarAdministradores() {
        return adminService.listarAdministradores();
    }

    @GetMapping("/{id}")
    public AdminDTO buscarAdmin(@PathVariable Long id) {
        return adminService.buscarAdmin(id);
    }

    @PostMapping
    public AdminDTO crearAdmin(@RequestBody AdminDTO adminDTO) {
        return adminService.crearAdmin(adminDTO);
    }

    @PutMapping("/{id}")
    public AdminDTO actualizarAdmin(@PathVariable Long id, @RequestBody AdminDTO adminDTO){
        return adminService.actualizarAdmin(adminDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAdmin(@PathVariable Long id) {
        adminService.eliminarAdmin(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/pruebita")
    public String pruebita(){
        return "Está funcionando Administradores :=)";
    }
}