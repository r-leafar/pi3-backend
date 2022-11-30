package br.com.pi3.API.entity;

import javax.persistence.*;

@Entity
@Table(name="avaliacao_servico")
public class AvaliacaoServicoEntity {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idavaliacaoservico;
    @ManyToOne
    private ServicoEntity servico;
    @ManyToOne
    private PessoaEntity avaliador;
    private String comentario;
    private Integer nota;

    public Long getIdavaliacaoservico() {
        return idavaliacaoservico;
    }

    public void setIdavaliacaoservico(Long idavaliacaoservico) {
        this.idavaliacaoservico = idavaliacaoservico;
    }

    public ServicoEntity getServico() {
        return servico;
    }

    public void setServico(ServicoEntity servico) {
        this.servico = servico;
    }

    public PessoaEntity getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(PessoaEntity avaliador) {
        this.avaliador = avaliador;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
