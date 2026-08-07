package Model.dao;

import Model.dao.impl.SellerDaoJDBC;
import Model.entities.Seller;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
