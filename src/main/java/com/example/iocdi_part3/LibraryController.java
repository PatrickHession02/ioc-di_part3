package com.example.iocdi_part3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class LibraryController {
    private LibraryService libraryService;

    @Autowired

    public LibraryController(LibraryService libraryService)
    {
      this.libraryService = libraryService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/AddBook")
}
