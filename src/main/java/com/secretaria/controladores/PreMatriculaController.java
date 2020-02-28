package com.secretaria.controladores;

import com.secretaria.dominios.PreMatricula;
import com.secretaria.servicos.PreMatriculaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pre-matricula")
public class PreMatriculaController {

    private PreMatriculaService preMatriculaService;

    public PreMatriculaController(PreMatriculaService preMatriculaService) {
        this.preMatriculaService = preMatriculaService;
    }

    @GetMapping
    public ResponseEntity getPreMatriculas() {
        List<PreMatricula> preMatriculas = preMatriculaService.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(preMatriculas);
    }

    @PostMapping
    public ResponseEntity alteraStatusPreMatricula(@PathVariable Long id) {
        preMatriculaService.alteraStatus(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
