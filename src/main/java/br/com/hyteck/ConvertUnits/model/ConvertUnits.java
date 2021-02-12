package br.com.hyteck.ConvertUnits.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class ConvertUnits implements Serializable  {

    private BigDecimal multiplication_factor;
private String unit_name;


}
