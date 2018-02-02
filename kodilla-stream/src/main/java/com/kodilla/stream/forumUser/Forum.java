package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "John Smith", 'm', LocalDate.of(2001, 6, 21), 16));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
