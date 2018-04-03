package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("ToDoList")
    TaskList tasks;

    @Bean(name = "ToDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList(Collections.singletonList("To-do list no.1"));
    }


    @Bean(name = "InProgresList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList(Collections.singletonList("In-progress list no.1"));
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList(Collections.singletonList("Done list no.1"));
    }
}
