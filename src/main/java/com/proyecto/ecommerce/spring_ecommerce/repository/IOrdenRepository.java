package com.proyecto.ecommerce.spring_ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.ecommerce.spring_ecommerce.model.Orden;
import com.proyecto.ecommerce.spring_ecommerce.model.Usuario;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{

    List<Orden> findByUsuario(Usuario usuario);

}
