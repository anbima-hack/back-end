package com.anbima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anbima.model.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, String> { }
