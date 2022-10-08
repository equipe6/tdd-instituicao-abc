package br.edu.unisinos.instituicaoabc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "matricula", schema = "public")
public class Matricula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "matricula_entity_seq", sequenceName = "matricula_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matricula_entity_seq")
    @Column(name = "id")
    private Long id;


}
