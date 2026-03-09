package com.irfan.pres;

import com.irfan.com.irfan.ext.DaoImplV2;
import com.irfan.dao.DaoImpl;
import com.irfan.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d  = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        // metier.setDao(d); // injection des dependences via le setter
        System.out.println("Result= "+metier.calcul());
    }
}
