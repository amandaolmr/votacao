package br.com.votacao.model.entity;

import lombok.*;
import org.apache.el.lang.ELArithmetic;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor // constutor com todos os atributos
@NoArgsConstructor // constutor vazio
@EqualsAndHashCode(of = "id")
@Table(name = "votos")
public class Voto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_voto")
    private Long idVoto;

    @Column(name = "data_hora_voto")
    private LocalDateTime dataHoraVoto;

    @Column(name = "id_eleitor")
    private Long idEleitor;

    @ManyToOne  //Muitos votos para uma sessão
    @JoinColumn(name = "id_voto_sessao")
    private VotoSessao votoSessao;


}
