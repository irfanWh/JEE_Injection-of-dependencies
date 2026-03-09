package com.irfan.pres;

import com.irfan.dao.DaoImpl;
import com.irfan.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d  = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        // metier.setDao(d); // injection des dependences via le setter
        System.out.println("Result= "+metier.calcul());
    }
}
