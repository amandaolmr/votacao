package br.com.votacao.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor // constutor com todos os atributos
@NoArgsConstructor // constutor vazio
@EqualsAndHashCode(of = "id")
@Table(name = "sessoes")
public class VotoSessao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_voto_sessao")
    private Long idVotoSessao;

    @Column(name = "data_de_abertura")
    private LocalDateTime dataAbertura;

    @Column(name = "data_de_fechamento")
    private  LocalDateTime dataFechamento;

    @OneToOne
    @JoinColumn(name = "id")
    private Pauta pauta;

    @OneToMany(mappedBy = "votoSessao")
    private List<Voto> votos;

}
