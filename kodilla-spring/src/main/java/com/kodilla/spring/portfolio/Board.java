package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Board {

    @Qualifier("ToDoList")
    @Autowired
    private TaskList toDoList;

    @Qualifier("InProgressList")
    @Autowired
    private TaskList inProgressList;

    @Qualifier("DoneList")
    @Autowired
    private TaskList doneList;

    public void boardContent() {
        System.out.println("The board contains: " + toDoList.getTasks() + inProgressList.getTasks() + doneList.getTasks());
    }
}
