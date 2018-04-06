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
        Book book4 = new Book("J", "O.P", LocalDate.of(1999, 05, 21));
        Book book5 = new Book("F", "S.A", LocalDate.of(1987, 03, 15));

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

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library no.3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        cloneLibrary.getBooks().add(book4);
        deepClonedLibrary.getBooks().add(book4);
        deepClonedLibrary.getBooks().add(book5);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
