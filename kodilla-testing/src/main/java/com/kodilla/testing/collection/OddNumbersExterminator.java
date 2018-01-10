package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int n = 0; n < numbers.size(); n++) {
            Integer element = numbers.get(n);

            if (element % 2 == 0) {
                result.add(element);

            }
        }

        return result;
    }
}