package com.epam.javacore2019.steve2.appserver;

import com.epam.javacore2019.steve2.appserver.dao.CriminalDAO;

public class CriminalService {

    CriminalDAO dao;

    public CriminalService() {
        dao = CriminalDAO.createDAO();
    }

    public ModelCriminal getCriminal(int id) {
        return dao.get(id);
    }




}
