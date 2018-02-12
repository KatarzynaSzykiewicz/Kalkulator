package com.kodilla.stream.sample;

import java.util.HashSet;
import java.util.Set;

public class GrantParent {

    private Set<Parent> parents = new HashSet<>();

    public Set<Parent> getParents() {
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "GrantParent{" +
                "parents=" + parents +
                '}';
    }
}
