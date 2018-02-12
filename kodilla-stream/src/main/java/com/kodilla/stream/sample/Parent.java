package com.kodilla.stream.sample;

import java.util.HashSet;
import java.util.Set;

public class Parent {

    private Set<Child> children = new HashSet<>();

    public Set<Child> getChildren() {
        return children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "children=" + children +
                '}';
    }
}
