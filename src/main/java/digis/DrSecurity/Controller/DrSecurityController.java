/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digis.DrSecurity.Controller;

import digis.DrSecurity.DAO.DireccionDAOImplementation;
import digis.DrSecurity.DAO.EstadoDAOImplementation;
import digis.DrSecurity.DAO.UsuarioDAOImplementation;
import digis.DrSecurity.JPA.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author digis
 */
@Controller
public class DrSecurityController {

    private UsuarioDAOImplementation usuarioDAOImplementation;
    private DireccionDAOImplementation direccionDAOImplementation;
    private EstadoDAOImplementation estadoDAOImplementation;

    @Autowired
    public DrSecurityController(UsuarioDAOImplementation usuarioDAOImplementation) {
        this.usuarioDAOImplementation = usuarioDAOImplementation;

    }

    @GetMapping("/usuarios")
    private String GetAllUsuario(Model model) {
        List<Usuario> usuarios = usuarioDAOImplementation.GetAll();
        model.addAttribute("usuarios", usuarios);
        return "vistaRegistro";
    }

//    @PostMapping("/usuarios")
//    private String GetAllUsuario(Model model, @ModelAttribute("usuariobusqueda") Usuario usuariobusqueda) {
//        List<Usuario> usuarios = usuarioDAOImplementation.GetAll();
//        model.addAttribute("usuarios", usuarios);
//
//        return "vistaRegistro";
//
//    }

    @GetMapping("/prueba")
    private String Prueba() {

        return "test";

    }
}
