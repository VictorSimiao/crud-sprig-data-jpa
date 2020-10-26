package br.com.victorreis.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.victorreis.crud.model.Usuario;
import br.com.victorreis.crud.repository.UsuarioRepository;
import br.com.victorreis.crud.service.UsuarioService;

@RequestMapping("/")
@Controller
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/")
    private String index(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("usuarios",usuarioService.listaUsuarios() );
        return "index";
    }

    @PostMapping("/cadastro")
    private String cadastro(@ModelAttribute("usuario") Usuario usuario){
        usuarioService.save(usuario);
        return "redirect:/";
    }
    @GetMapping("delete")
    private String delete(@RequestParam("id") Integer id){
        usuarioService.delete(id);
        return "redirect:/";
    }

}
