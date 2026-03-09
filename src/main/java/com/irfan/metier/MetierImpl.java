package com.irfan.metier;

import com.irfan.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; //couplage faible

    /**
     * pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente qui l'interface IDao
     * au momment de l'instantiation
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double result = t*12*Math.PI/2*Math.cos(t);
        return result;
    }

    /**
     * pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente qui l'interface IDao
     * apres instantiation
     */
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
