package br.edu.unisinos.instituicaoabc.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

}