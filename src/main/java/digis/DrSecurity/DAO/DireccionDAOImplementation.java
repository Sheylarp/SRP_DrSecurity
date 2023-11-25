/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digis.DrSecurity.DAO;

import digis.DrSecurity.JPA.Colonia;
import digis.DrSecurity.JPA.DireccionActual;
import digis.DrSecurity.JPA.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author digis
 */
@Repository
public class DireccionDAOImplementation implements IDireccionDAO {

    private EntityManager entityManager;

    @Autowired
    public DireccionDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<DireccionActual> GetAll() {
        TypedQuery<DireccionActual> query = entityManager.createQuery("FROM DireccionActual", DireccionActual.class);
        List<DireccionActual> direccionActuals = query.getResultList();
        return direccionActuals;
    }

    @Override
    public DireccionActual GetByIdUsuario(int idDireccionActual) {
        TypedQuery<DireccionActual> query = entityManager.createQuery("FROM DireccionActual where iddireccionactual=:idDireccionActual", DireccionActual.class);
        query.setParameter("idDireccionActual", idDireccionActual);
        return query.getSingleResult();
    }

    @Override
    public void Add(DireccionActual direccionActual) {
        Usuario usuario= new Usuario();
        usuario.setIdusuario(0);
        usuario.setDireccionactual(direccionActual);
        
        Colonia colonia = new Colonia();
        colonia.setIdcolonia(0);
       
        
    entityManager.persist(direccionActual);
    
    }

}
