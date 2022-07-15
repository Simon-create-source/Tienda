
package com.Tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="credito")

public class Credito implements Serializable {
    private static final long serialVersionUID= 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")
    private Long idCredito; //hibernate lo transforma en id
    private double limiteTotal;

    public Credito() {
    }

    public Credito(double limite) {
        this.limiteTotal = limite;
    }
    
    
    
}
