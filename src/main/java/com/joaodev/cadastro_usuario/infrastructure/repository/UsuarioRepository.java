package com.joaodev.cadastro_usuario.infrastructure.repository;

import com.joaodev.cadastro_usuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Optional usado pra evitar o nullPointerException
   Optional<Usuario> findByEmail(String email);

   @Transactional //Anotação que serve para caso der algum erro, ele NÃO pode DELETAR o que é pedido
    void deleteByEmail(String email);
}
