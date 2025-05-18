package com.vitanova.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitanova.model.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
