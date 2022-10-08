package br.edu.unisinos.instituicaoabc.services;

import br.edu.unisinos.instituicaoabc.entities.Matricula;
import br.edu.unisinos.instituicaoabc.repositories.MatriculaRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class MatriculaService implements Serializable {

    private static final long serialVersionUID = 1L;

    private final transient MatriculaRepository matriculaRepository;

    public Matricula matricular(Matricula matricula) {
        // TODO
        return null;
    }


}
