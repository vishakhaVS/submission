package com.ttn.java2;

//class- Question1,Admin,Member,Book
//adminLogin,memberLogin,addBook,removeBook

public class Question1 {
    public static void main(String[] args) {

    }

    interface adminLogin {

        void issuedBookDetails();

        void calculateFine();

        void sendMail();

    }

    interface memberLogin {

        void issuedBooks();

        void finePayment();

        void searchBook();
    }

    interface addBook {
        void add();
    }


    interface calculateFine {

        void calculate();
    }

    class Admin implements adminLogin, addBook, calculateFine {

        int id;
        String password;

        public void showLibraryDetails() {

        }


        @Override
        public void issuedBookDetails() {

        }

        @Override
        public void calculateFine() {

        }


        @Override
        public void sendMail() {

        }

        @Override
        public void add() {

        }


        @Override
        public void calculate() {
            // TODO Auto-generated method stub

        }

    }

    class Book {


        String author;
        float price;
        int quantity;
        int isbn;
    }

    class Member {

        int id;
        String password;


    }


}
