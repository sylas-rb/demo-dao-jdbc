package application;

import Model.dao.DaoFactory;
import Model.dao.DepartmentDao;
import Model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println(" ==== TEST 1: department insert =====");
        Department department = new Department(null, "Story");
        departmentDao.insert(department);
        System.out.println("Inserted! new id = " + department.getId());

        System.out.println(" ==== TEST 2: department findById ====");
        department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println(" ==== TEST 3: department update =====");
        department = departmentDao.findById(4);
        department.setName("BookStore");
        departmentDao.update(department);
        System.out.println("Updated! new name = " + department.getName());

        System.out.println(" ==== TEST 4: department delete =====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete successful!");

        System.out.println(" ==== TEST 5: department findAll ====");
        List<Department> departments = departmentDao.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }
    }
}
