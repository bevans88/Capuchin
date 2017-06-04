package com.mjolnir.dao.service;

import com.mjolnir.dao.IBaseDao;

import java.util.List;

// TODO: Should this be a separate module?
public class DaoService {

    // List of IBaseDaos, calls init on them all.

    private final List<IBaseDao> daos;

    public DaoService(List<IBaseDao> daos) {
        this.daos = daos;
    }

    public void init() {
        for (IBaseDao dao : daos) {
            dao.init();
        }
    }
}
