package com.omega.currencyglobalcore.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="currency_data")
public class CurrencyDataEntity {
    

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence_generator")
    private int id;

    @Column
    private String symbol;

    @Column
    private String name;

    @Column
    private String symbolNative;

    @Column
    private int decimalDigits;

    @Column
    private int rounding;

    @Column(unique = true)
    private String code;

    @Column
    private String namePlural;

    @Column
    private String type;

}
