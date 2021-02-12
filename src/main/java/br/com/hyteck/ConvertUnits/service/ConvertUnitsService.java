package br.com.hyteck.ConvertUnits.service;

import br.com.hyteck.ConvertUnits.model.ConvertUnits;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ConvertUnitsService {


    public ConvertUnits convert(String units){
        if(units.equalsIgnoreCase("minutes") ||
                units.equalsIgnoreCase("min")) {
            return new ConvertUnits(new BigDecimal(60).setScale(14, RoundingMode.CEILING), "seconds");
        }
         else if (units.equalsIgnoreCase("hour") ||
                units.equalsIgnoreCase("h")) {
            return new ConvertUnits(new BigDecimal(3600).setScale(14, RoundingMode.CEILING), "seconds");
        }
        else if (units.equalsIgnoreCase("day") ||
                units.equalsIgnoreCase("d")) {
            return new ConvertUnits(new BigDecimal(86400).setScale(14, RoundingMode.CEILING), "seconds");
        }
        else if (units.equalsIgnoreCase("degree") ||
                units.equalsIgnoreCase("")) {
            return new ConvertUnits((new BigDecimal(Math.PI/180)).setScale(14, RoundingMode.CEILING), "unitess/plane angle");
        }
        else if (units.equalsIgnoreCase("arcminute") ||
                units.equalsIgnoreCase("'")) {
            return new ConvertUnits(new BigDecimal(Math.PI/1800).setScale(14, RoundingMode.CEILING), "unitess/plane angle");
        }
        else if (units.equalsIgnoreCase("arcsecond") ||
                units.equalsIgnoreCase("''")) {
            return new ConvertUnits(new BigDecimal(Math.PI/648000).setScale(14, RoundingMode.CEILING), "unitess/plane angle");
        }
        else if (units.equalsIgnoreCase("hectare") ||
                units.equalsIgnoreCase("ha")) {
            return new ConvertUnits(new BigDecimal(10000).setScale(14, RoundingMode.CEILING), "area");
        }
        else if (units.equalsIgnoreCase("litle") ||
                units.equalsIgnoreCase("l")) {
            return new ConvertUnits(new BigDecimal("0.001").setScale(14, RoundingMode.CEILING), "volume");
        }
        else if (units.equalsIgnoreCase("tonne") ||
                units.equalsIgnoreCase("t")) {
            return new ConvertUnits(new BigDecimal(1000), "mass");

        }

        return null;







    }




}

