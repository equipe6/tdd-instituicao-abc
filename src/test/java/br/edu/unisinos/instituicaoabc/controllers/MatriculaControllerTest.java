package br.edu.unisinos.instituicaoabc.controllers;

import br.edu.unisinos.instituicaoabc.dtos.MatriculaDto;
import br.edu.unisinos.instituicaoabc.services.MatriculaService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class MatriculaControllerTest {


    @Mock
    private MatriculaService matriculaService;

    private MatriculaController matriculaController;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        this.matriculaController = BDDMockito.spy(new MatriculaController(matriculaService));
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    //@Test
    void testMatricular() throws Exception {
        MatriculaDto matriculaDto = new MatriculaDto();

        //TODO
        var result = this.matriculaController.matricular(matriculaDto);
        assertNotNull(result);
    }
}