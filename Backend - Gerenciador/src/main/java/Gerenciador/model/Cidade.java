package Gerenciador.model;

import javax.persistence.*;

@Entity
@Table(name = "Cidade")
public class Cidade {
    @GeneratedValue
    @Id
    @Column(name = "CidadeId")
    private Integer cidadeId;

    public Integer getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(Integer cidadeId) {
        this.cidadeId = cidadeId;
    }

    @Column(name = "NomeCidade")
    private String nome;

    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
