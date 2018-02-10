package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
      /*  System.out.println("Welcome to module 7 - Stream");


        SaySomething saySomething = new SaySomething();
        saySomething.say();


        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/


        //zad. 7.1

        //option 1
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String text = "Ula ma kota.";
        PoemDecorator poemDecorator = new PoemDecoratorImpl();

//        poemBeautifier.beautify(text, poemDecorator);

        //option 2
        PoemDecorator poemDecorator2 = new PoemDecorator() {
            @Override
            public String decorate(String text) {
                return "@" + text + "@";
            }
        };

//        poemBeautifier.beautify("Ula ma kota.", poemDecorator2);

        //option 3
        PoemDecorator poemDecorator3 = (text3) -> ("@" + text3 + "@");

//        poemBeautifier.beautify("Ula ma kota.", poemDecorator3);

        //option 4
        poemBeautifier.beautify("Ula ma kota.", (text4) -> (("@" + text4 + "@").toUpperCase()));


//        poemBeautifier.beautify("Pada śnieg.", ("***") -> System.out.println("***" + "Pada śnieg"));
//        poemBeautifier.beautify("Zbliza sie wiosna.", text.toUpperText())

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

        People.getList().stream().forEach(System.out::println);

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

//        przykład 7.2a

//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        przykład 7.2b

        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        BookDirectory theBookDirectory2 = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory2.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        BookDirectory theBookDirectory3 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory3.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        //Zad 7.3

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResult = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() = 'm')
                .filter(forumUser -> forumUser.calculateAge() <= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts()) >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
        theResult.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}
