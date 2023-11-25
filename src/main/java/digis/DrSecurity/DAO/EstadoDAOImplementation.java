/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digis.DrSecurity.DAO;

import digis.DrSecurity.JPA.Estado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author digis
 */
@Repository
public class EstadoDAOImplementation implements IEstadoDAO {

    private EntityManager entityManager;

    public EstadoDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Estado> GetAll() {
        TypedQuery<Estado> query = entityManager.createQuery("FROM Estado", Estado.class);
        List<Estado> estados = query.getResultList();
        return estados;
    }

    @Override
    public List<Estado> GetByIdUsuario(int idUsuario) {
        TypedQuery<Estado> query = entityManager.createQuery("FROM Estado  where idestado=:idUsuario", Estado.class);
        query.setParameter("idUsuario", idUsuario);
        return query.getResultList();

    }

}
