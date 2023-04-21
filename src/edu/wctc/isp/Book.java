package edu.wctc.isp;

public interface Book extends Product{

    String getAuthor();

    String getISBN();

    int getPages();
}
