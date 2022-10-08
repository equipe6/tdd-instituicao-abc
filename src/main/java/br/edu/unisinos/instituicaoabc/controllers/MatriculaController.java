package br.edu.unisinos.instituicaoabc.controllers;


import br.edu.unisinos.instituicaoabc.dtos.MatriculaDto;
import br.edu.unisinos.instituicaoabc.services.MatriculaService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/matricula")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class MatriculaController {

    private final MatriculaService matriculaService;

    @PostMapping(value = "matricular", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public MatriculaDto matricular(@RequestBody MatriculaDto matriculaDto) {
        log.info(matriculaDto);

        return null;
    }
}
