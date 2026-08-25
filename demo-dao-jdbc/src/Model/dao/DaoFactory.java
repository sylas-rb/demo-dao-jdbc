package Model.dao;

import Model.dao.impl.DepartamentDaoJDBC;
import Model.dao.impl.SellerDaoJDBC;
import db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() { return new DepartamentDaoJDBC(DB.getConnection());}
}
