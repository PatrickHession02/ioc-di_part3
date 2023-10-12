package com.example.iocdi_part3;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor

public class Book {
    private String author;
    private String title;
    private int isbnb;
    private int publishedYear;
}
