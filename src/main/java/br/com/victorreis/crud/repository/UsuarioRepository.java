package br.com.victorreis.crud.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.victorreis.crud.model.Usuario;
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    Usuario findUsuarioById(Integer id);
}
