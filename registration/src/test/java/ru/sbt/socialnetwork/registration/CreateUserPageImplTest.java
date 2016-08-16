package ru.sbt.socialnetwork.registration;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;


import org.mockito.runners.MockitoJUnitRunner;
import ru.sbt.socialnetwork.domain.User;

import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by i.viktor on 16/08/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class CreateUserPageImplTest {

    @Mock
    HashSet<User> users;
    CreateUserPage createUserPage;
    User user = new User(1, "Petr");

    @Before
    public void setUp() throws Exception {
        createUserPage = new CreateUserPageImpl(users);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addBadUser() {
        doThrow(IllegalArgumentException.class).when(users).add(user);
        createUserPage.addUser(user);
    }

    @Test
    public void addUser() {
        createUserPage.addUser(user);

        verify(users).add(user);
    }
}
