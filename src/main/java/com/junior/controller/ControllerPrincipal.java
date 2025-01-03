package com.junior.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junior.model.Clientes;
import com.junior.repository.ClientesRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/clientes")
@AllArgsConstructor

public class ControllerPrincipal {

    private final ClientesRepository clientesRepository;

    @GetMapping
    public List<Clientes> list() {
        return clientesRepository.findAll();
    }
    
}
