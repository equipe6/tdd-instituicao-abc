package br.edu.unisinos.instituicaoabc.services;

import br.edu.unisinos.instituicaoabc.entities.Matricula;
import br.edu.unisinos.instituicaoabc.repositories.MatriculaRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class MatriculaServiceTest {

    @Mock
    private MatriculaRepository matriculaRepository;

    private MatriculaService matriculaService;


    private CursoService cursoService;

    private PessoaService pessoaService;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        this.matriculaService = BDDMockito.spy(new MatriculaService(matriculaRepository, cursoService, pessoaService));
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @Test
    void testMatricular() throws Exception {

        Matricula matricula = new Matricula();

        given(this.matriculaRepository.save(any(Matricula.class))).willReturn(new Matricula());

        var result = this.matriculaService.matricular(matricula);
        assertNotNull(result);
    }

}