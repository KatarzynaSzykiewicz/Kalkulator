package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("taskList1")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }

    @Bean(name = "taskList1")
    @Scope("prototype")
    public TaskList getTaskListOne() {
        return new TaskList(List<String>"To-Do List1");
    }
}
