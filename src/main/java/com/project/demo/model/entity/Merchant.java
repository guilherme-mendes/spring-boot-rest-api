package com.project.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "MERCHANT_TBL")
public class Merchant implements Serializable {

    private static final long serialVersionUID = 5353568663634818971L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "ADDRESS")
    private String address;

}
