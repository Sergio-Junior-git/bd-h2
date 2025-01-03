package com.junior.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 200, nullable = true, unique = true)
    private String email;

    @Column(length = 200, nullable = true)
    private String telefone;

    @Column(length = 200, nullable = true)
    private String cep;
    
    @Column(length = 200, nullable = true)
    private String endereco;

    @Column(length = 200, nullable = true)
    private String bairro;

    @Column(length = 200, nullable = true)
    private String cidade;

    @Column(length = 200, nullable = true)
    private String estado;

}
