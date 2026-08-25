package application;

import Model.dao.DaoFactory;
import Model.dao.DepartmentDao;
import Model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println(" ==== TEST 1: department insert =====");
        Department department = new Department(null, "Story");
        departmentDao.insert(department);
        System.out.println("Inserted! new id = " + department.getId());
    }
}
