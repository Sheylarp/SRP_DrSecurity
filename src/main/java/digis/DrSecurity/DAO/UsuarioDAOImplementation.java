/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digis.DrSecurity.DAO;

import digis.DrSecurity.JPA.DireccionActual;
import digis.DrSecurity.JPA.Estado;
import digis.DrSecurity.JPA.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author digis
 */
@Repository
public class UsuarioDAOImplementation implements IUsuarioDAO {
    
    private EntityManager entityManager;
    
    @Autowired
    public UsuarioDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public List<Usuario> GetAll() {
        TypedQuery<Usuario> query = entityManager.createQuery("FROM Usuario", Usuario.class);
        List<Usuario> usuarios = query.getResultList();
        return usuarios;
    }
    
    @Override
    @Transactional
    public int Add(Usuario usuario) {
        usuario.setFechanacimiento(new Date());
        //usuario.getFechanacimiento();
        DireccionActual direccionActual = new DireccionActual();
        direccionActual.setIddireccion(0);
        usuario.setDireccionactual(direccionActual);
        
        Estado estado = new Estado();
        estado.setIdestado(0);
        usuario.setEstado(estado);
        
        entityManager.persist(usuario);
        return usuario.getIdusuario();
        
    }
    
    @Override
    @Transactional
    public void Update(Usuario usuario) {
        entityManager.merge(usuario);
    }
    
    @Override
    public Usuario GetById(int idusuarioeditable) {
        TypedQuery<Usuario> query = entityManager.createQuery("FROM Usuario where idusuario=: idusuarioeditable", Usuario.class);
        query.setParameter("idusuarioeditable", idusuarioeditable);
        return query.getSingleResult();
    }
    
    @Override
    @Transactional
    public void Delete(int idusuarioeliminado) {
        Usuario usuarioEliminar = entityManager.find(Usuario.class, idusuarioeliminado);
        entityManager.remove(usuarioEliminar);
    }
    
}
