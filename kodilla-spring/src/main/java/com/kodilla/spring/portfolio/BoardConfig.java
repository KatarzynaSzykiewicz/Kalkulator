package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean(name = "ToDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> strings = new ArrayList<>();
        strings.add("To-do list no.1");
        return new TaskList(strings);
    }

    @Bean(name = "InProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList(Arrays.asList("In-progress list no.1"));
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList(Arrays.asList("Done list no.1"));
    }

}
