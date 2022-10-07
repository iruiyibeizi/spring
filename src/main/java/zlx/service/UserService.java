package zlx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zlx.dao.UserDao;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    public void insertUser(){

        userDao.insert();
        int i=5/0;
    }


}
