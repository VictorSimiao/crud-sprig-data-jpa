package br.com.victorreis.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.victorreis.crud.model.Usuario;
import br.com.victorreis.crud.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
    
    public void delete(Integer id){
        usuarioRepository.delete(usuarioRepository.findUsuarioById(id));
    }
    
    public Usuario buscarPorId(Integer id){
        return usuarioRepository.findUsuarioById(id);
    }
}
