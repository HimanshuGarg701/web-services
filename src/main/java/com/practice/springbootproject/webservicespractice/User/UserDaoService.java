package com.practice.springbootproject.webservicespractice.User;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
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

    public User addUser(User user){
        if(user.getId()==null) {
            user.setId(userCount);
            userCount++;
        }
        users.add(user);
        return user;
    }

    public User getUser(Integer id){
        for(User user: users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User deleteUser(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId()==id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return users;
    }
}
