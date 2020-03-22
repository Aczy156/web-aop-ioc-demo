package org.csu.spring.demo.IOC.test;

import org.csu.spring.demo.IOC.persistence.DAO;
import org.csu.spring.demo.IOC.persistence.DAOimpl;
import org.junit.Test;

public class demotest {
    @Test
    public void test(){
        DAO dao = new DAOimpl();
        dao.insert();
        dao.delete();
        dao.update();
        dao.query();
    }
}
