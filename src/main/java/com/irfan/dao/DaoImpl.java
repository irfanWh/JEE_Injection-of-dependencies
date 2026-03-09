package com.irfan.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de doonees");
        double t = 456;
        return t;
    }
}
