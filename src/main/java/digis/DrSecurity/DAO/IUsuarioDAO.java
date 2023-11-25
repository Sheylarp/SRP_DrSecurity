/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package digis.DrSecurity.DAO;

import digis.DrSecurity.JPA.Usuario;
import java.util.List;

/**
 *
 * @author digis
 */
public interface IUsuarioDAO {

    List<Usuario> GetAll();

    int Add(Usuario usuario);

    void Update(Usuario usuario);

    Usuario GetById(int idusuarioeditable);

    void Delete(int idusuarioeliminado);
}
