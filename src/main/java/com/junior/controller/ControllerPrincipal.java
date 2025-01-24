package com.junior.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    //@RequestMapping(method = RequestMapping.Post)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Clientes create(@RequestBody Clientes clientes) {
        return clientesRepository.save(clientes);
      //return ResponseEntity.status(HttpStatus.CREATED).body(clientesRepository.save(clientes));
    }
    
}
