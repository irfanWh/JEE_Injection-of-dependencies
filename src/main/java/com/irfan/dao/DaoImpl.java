package com.irfan.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("d")
@Repository("d")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de doonees");
        double t = 456;
        return t;
    }
}
