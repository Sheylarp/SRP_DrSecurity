/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package digis.DrSecurity.DAO;

import digis.DrSecurity.JPA.DireccionActual;
import java.util.List;

/**
 *
 * @author digis
 */
public interface IDireccionDAO {

    List<DireccionActual> GetAll();

    DireccionActual GetByIdUsuario(int idDireccionActual);

    void Add(DireccionActual direccionActual);

}
