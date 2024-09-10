package com.proyecto.ecommerce.spring_ecommerce.service;

import java.util.Optional;
import java.util.List;

import com.proyecto.ecommerce.spring_ecommerce.model.Producto;

public interface ProductoService {

    public Producto save (Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
    public List<Producto> findAll();
    
}
