package ru.sbt.socialnetwork.registration;

import ru.sbt.socialnetwork.domain.User;

/**
 * Created by i.viktor on 16/08/16.
 */
public interface CreateUserPage {

    void addUser(User user);

    User getUser(int userId);

}
