package br.com.renan.springbootcommysql.controller.dto;

public class PessoaRq {

    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
