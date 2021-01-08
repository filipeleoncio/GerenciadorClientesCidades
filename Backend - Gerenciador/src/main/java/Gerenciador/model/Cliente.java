package Gerenciador.model;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @GeneratedValue
    @Id
    @Column(name = "ClienteId")
    private Integer clienteId;

    private String nome;

    private Character sexo;

    @Column(name = "dataDeNascimento")
    private String dataNasc;

    private Integer idade;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CidadeId")
    private Cidade cidadeResidente;

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Cidade getCidadeResidente() { return cidadeResidente; }

    public void setCidadeResidente(Cidade cidadeResidente) { this.cidadeResidente = cidadeResidente; }
}