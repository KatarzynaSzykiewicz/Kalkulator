package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    public void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        //Then
        board.boardContent();
    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = (Board) context.getBean("ToDoList");
        board.toDoList.getTasks().add("To-do task no.1");
        //When
        int result = board.toDoList.getTasks().size();
        //Then
        Assert.assertEquals(1, result);
    }
}
