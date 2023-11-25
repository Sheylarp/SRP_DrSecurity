/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package digis.DrSecurity.DAO;

import digis.DrSecurity.JPA.Estado;
import java.util.List;

/**
 *
 * @author digis
 */
public interface IEstadoDAO {
    
    List<Estado> GetAll();
    List <Estado> GetByIdUsuario(int idUsuario);
    
}
