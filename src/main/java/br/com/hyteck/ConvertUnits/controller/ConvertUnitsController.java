package br.com.hyteck.ConvertUnits.controller;

import br.com.hyteck.ConvertUnits.model.ConvertUnits;
import br.com.hyteck.ConvertUnits.service.ConvertUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/units/si")
public class ConvertUnitsController {
    @Autowired
    private ConvertUnitsService service;

    @GetMapping
    public ConvertUnits convert(@RequestParam String units){
        return service.convert(units);

    }
}