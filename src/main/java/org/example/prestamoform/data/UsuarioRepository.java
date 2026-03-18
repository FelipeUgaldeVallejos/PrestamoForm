package org.example.prestamoform.data;

import org.example.prestamoform.logic.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
