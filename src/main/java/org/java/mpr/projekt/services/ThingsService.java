package org.java.mpr.projekt.services;

import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.java.mpr.projekt.domain.Things;

@Stateful
@Named("thingsService")
public class ThingsService {
    
    @PersistenceContext(unitName = "8168_PU")
    private EntityManager em;
    
    public List<Things> getAllThings() {
        return em.createQuery("select t from Things t").getResultList();
    }
    
    public void remove(Things thing) {
        thing = em.merge(thing);
        em.remove(thing);
    }
 
    public void merge(Things thing) {
        em.merge(thing);
    }
}
