package org.eclipse.jakarta.model.DAO;

import org.eclipse.jakarta.model.Ativos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

@Stateless
public class AtivoDAO {

    private final EntityManager entityManager;

    public AtivoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Ativos getAtivos() {
        return entityManager.find(Ativos.class, 1);
    }
}
