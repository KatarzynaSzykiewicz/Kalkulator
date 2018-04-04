package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Q", "M.S", LocalDate.of(2001, 04, 19));
        Book book2 = new Book("S", "R.S", LocalDate.of(2014, 02, 24));
        Book book3 = new Book("B", "H.J", LocalDate.of(2015, 06, 18));

        Library library = new Library("Library no.1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library no.2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        int result = library.getBooks().size();

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        Assert.assertEquals(3, result);
    }
}
