package br.com.pi3.API.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "servico")
public class ServicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(columnDefinition = "serial")
    private Long idservico;

    private String especialidade;

    private String descricao;

    private String horaInicio;

    private String horaFim;

    private Double valorServico;

    private String formaPagamento;

    private String imagem;

    private

    @ManyToOne()
    SegmentoEntity segmento;

    @ManyToOne()
    PessoaEntity pessoa;




}
