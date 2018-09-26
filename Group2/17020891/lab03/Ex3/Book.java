package com.company;
class Book {
    private String name;
    private String id;
    private String author;
    private Double price;
    //constructor
    public Book(String name, String id, String author, Double price) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.price = price;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    //getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
    //toString
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}