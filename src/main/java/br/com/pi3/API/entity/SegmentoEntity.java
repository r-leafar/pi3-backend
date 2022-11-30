package br.com.pi3.API.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "segmento")
public class SegmentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(columnDefinition = "serial")
    private Long idsegmento;
    private String nome;
    private String descricao;

    private String imagem;

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public SegmentoEntity() {
    }

    public Long getIdsegmento() {
        return idsegmento;
    }

    public void setIdsegmento(Long idsegmento) {
        this.idsegmento = idsegmento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
