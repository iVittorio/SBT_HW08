package ru.sbt.socialnetwork.registration;

import ru.sbt.socialnetwork.domain.User;

import java.util.HashSet;


/**
 * Created by i.viktor on 16/08/16.
 */
public class CreateUserPageImpl implements CreateUserPage {

    public HashSet<User> users;

    public CreateUserPageImpl(HashSet<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        if(users.contains(user)) throw new IllegalArgumentException("Такой пользователь уже существует");
        users.add(user);
    }

    public User getUser(int userId) {
        int count = 0;
        User user = null;
        for(User user1 : users) {
            if(user1.getId() == userId) {
                user = user1;
                count++;
            }
        }
        if(count == 0) throw new IllegalArgumentException("Пользователь не найден");
        return user;
        }

}

