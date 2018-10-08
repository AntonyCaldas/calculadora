package br.edu.ifro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer primeiroValor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(Integer primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public Integer getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(Integer segundoValor) {
        this.segundoValor = segundoValor;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
    private Integer segundoValor;
    private Integer resultado;


    
}
