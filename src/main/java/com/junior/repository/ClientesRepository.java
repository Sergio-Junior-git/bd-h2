package com.junior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.junior.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
 