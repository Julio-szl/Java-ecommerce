package com.proyecto.ecommerce.spring_ecommerce.service;

import java.util.List;

import com.proyecto.ecommerce.spring_ecommerce.model.Orden;
import com.proyecto.ecommerce.spring_ecommerce.model.Usuario;

public interface IOrdenService {

    List<Orden> findAll();
    Orden save(Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario(Usuario usuario);

}
