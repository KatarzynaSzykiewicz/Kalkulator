package com.kodilla.stream.sample;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {


        Set<Child> childrenOfParentA = new HashSet<>();

        Child childA = new Child();
        childA.setAge(123);

        Child childB = new Child();
        childB.setAge(12);

        Child childC = new Child();
        childC.setAge(13);

        childrenOfParentA.add(childA);
        childrenOfParentA.add(childB);
        childrenOfParentA.add(childC);

        Parent parentA = new Parent();

        parentA.setChildren(childrenOfParentA);



        Set<Child> childrenOfParentB = new HashSet<>();

        Child childD = new Child();
        childD.setAge(15);

        Child childE = new Child();
        childE.setAge(21);

        childrenOfParentB.add(childD);
        childrenOfParentB.add(childE);

        Parent parentB = new Parent();
        parentB.setChildren(childrenOfParentB);




        Set<Parent> parents = new HashSet<>();
        parents.add(parentA);
        parents.add(parentB);

        GrantParent grantParent = new GrantParent();
        grantParent.setParents(parents);

        System.out.println("\n\n FIRST \n\n");
        grantParent.getParents().forEach(parent -> System.out.println(parent));

        System.out.println("\n\n SECOND \n\n");
        grantParent.getParents().stream().flatMap(parent -> parent.getChildren().stream()).forEach(child -> System
                .out.println(child));

        System.out.println("\n\n THIRD \n\n");
        grantParent.getParents().stream().flatMap(parent -> parent.getChildren().stream()).map(child -> child.getAge
                ()).forEach(integer -> System.out.println(integer));

        System.out.println("\n\n RESULT \n\n");
        int result = grantParent.getParents()
                .stream()
                .flatMap(parent -> parent.getChildren().stream())
                .map(child -> child.getAge())
                .reduce(((integer, integer2) -> integer + integer2))
                .get();

        System.out.println(result);
    }

}
