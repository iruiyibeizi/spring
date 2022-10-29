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


import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @EventListener(classes = ApplicationEvent.class)
    public void listen(ApplicationEvent event){
        System.out.println("UserServer...监听到的事件"+event);
    }
}
