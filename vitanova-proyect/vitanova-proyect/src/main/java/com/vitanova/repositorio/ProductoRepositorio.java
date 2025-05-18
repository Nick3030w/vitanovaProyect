package com.vitanova.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitanova.model.Producto;

/**
 * @author Nick3030w
 */
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
