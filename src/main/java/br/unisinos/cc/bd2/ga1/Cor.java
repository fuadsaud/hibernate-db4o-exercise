package br.unisinos.cc.bd2.ga1;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * @author fuad, @date 8/27/15 12:43 AM
 */

@Entity
public class Cor implements java.io.Serializable {
    @Id
    private Long codigoCor;

    private String nome;
}
