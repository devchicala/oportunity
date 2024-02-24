package com.study.comercial.controller;

import com.study.comercial.model.Oportunities;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/oportunities")
public class ControllerOportunity {
    @GetMapping
    public List<Oportunities> listar() {
        Oportunities oportunity = new Oportunities();
        oportunity.setId(1L);
        oportunity.setDescricao("Desenvolvimento de ERP com Angular and Spring");
        oportunity.setNomeEmpresa("Grupo Logística Brasil");
        oportunity.setValor(new BigDecimal(490.000));

        return Arrays.asList(oportunity);
    }
}