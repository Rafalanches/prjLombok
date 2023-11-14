package com.rafael.lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
