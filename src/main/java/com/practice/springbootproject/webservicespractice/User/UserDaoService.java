package com.practice.springbootproject.webservicespractice.User;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList();
    private static int userCount = 4;
    static{
        users.add(new User(1, "John", "United States"));
        users.add(new User(2, "Williamson", "New Zealand"));
        users.add(new User(3, "Finch", "Australia"));
    }

    public void addUser(User user){
        if(user.getId()!=null) {
            user.setId(userCount);
            userCount++;
        }
        users.add(user);
    }

    public User getUser(Integer id){
        for(User user: users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return users;
    }
}
