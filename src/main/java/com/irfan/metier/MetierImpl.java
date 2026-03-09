package com.irfan.metier;

import com.irfan.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("metier")
@Service("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    //@Qualifier("d2")
    private IDao dao; //couplage faible

    /**
     * pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente qui l'interface IDao
     * au momment de l'instantiation
     */
    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
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
