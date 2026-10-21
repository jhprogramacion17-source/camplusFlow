package com.javDev.campusFlow.usuarios.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.javDev.campusFlow.usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
