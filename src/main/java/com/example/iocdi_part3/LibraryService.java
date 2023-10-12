package com.example.iocdi_part3;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;

@Service
public class LibraryService {
    private List<Book> library = new ArrayList<>();


    public void AddBook(Book book){
        System.out.println(book);
        library.add(book);
    }

    public List<Book> getBooks(){
        return library;
    }
}
