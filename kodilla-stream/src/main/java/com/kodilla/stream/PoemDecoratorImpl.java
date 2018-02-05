package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemDecorator;

public class PoemDecoratorImpl implements PoemDecorator {

    @Override
    public String decorate(String text) {
        return "@" + text + "@";
    }
}
