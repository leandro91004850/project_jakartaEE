package org.eclipse.jakarta.services;

import org.eclipse.jakarta.model.Ativos;
import org.eclipse.jakarta.model.DAO.AtivoDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class AtivosServices {

   @Inject
   private AtivoDAO ativoDAO;

    public Ativos getAtivos() {
        System.out.println("Estou aqui");
        return ativoDAO.getAtivos();
    }
}
