package com.secretaria.servicos;

import com.secretaria.dominios.PreMatricula;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreMatriculaService {

    private PreMatriculaRepository preMatriculaRepository;

    public PreMatriculaService(PreMatriculaRepository preMatriculaRepository) {
        this.preMatriculaRepository = preMatriculaRepository;
    }

    public List<PreMatricula> listarTodos() {
        return preMatriculaRepository.getList();
    }

    public void alteraStatus(Long id) {
    }
}
