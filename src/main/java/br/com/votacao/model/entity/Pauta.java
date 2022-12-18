package br.com.votacao.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor // constutor com todos os atributos
@NoArgsConstructor // constutor vazio
@EqualsAndHashCode(of = "id")
@Table(name = "pautas")
public class Pauta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pauta")
    private long idPauta;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;
}
