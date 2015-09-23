package br.unisinos.cc.bd2.ga1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Collection;

/*
 * @author fuad, @date 8/27/15 12:43 AM
 */

@Entity
public class EstoqueGradeItem implements java.io.Serializable {
    @Id
    private Long codigoGradeItem;

    private String nome;

    @ManyToOne
    private Grade grade;

    @ManyToOne
    private Cor cor;

    @ManyToOne
    private Tamanho tamanho;
}
