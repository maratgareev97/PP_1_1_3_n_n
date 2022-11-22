package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

        UserDao userDao = new UserDaoJDBCImpl();
//    UserDao userDaoHibernate = new UserDaoHibernateImpl();

    public void connection_base() {
    }

    public void createUsersTable() {
        userDao.createUsersTable();
//        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
//        userDaoHibernate.dropUsersTable();
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name,lastName,age);
//        userDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
//        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
//        return userDaoHibernate.getAllUsers();
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
//        userDaoHibernate.cleanUsersTable();
    }
}
