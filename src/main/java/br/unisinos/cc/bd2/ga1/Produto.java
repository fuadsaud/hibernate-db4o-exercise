package br.unisinos.cc.bd2.ga1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/*
 * @author fuad, @date 8/27/15 12:43 AM
 */

@Entity
public class Produto implements java.io.Serializable {
    @Id
    private Long codigoProduto;

    private String nome;
    private Integer estoqueAtual;
    private Integer estoqueMinimo;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Grade grade;
}
