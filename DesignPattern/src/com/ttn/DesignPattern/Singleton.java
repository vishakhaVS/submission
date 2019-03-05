    package com.ttn.DesignPattern;

    class SingleObject {


        private static SingleObject instance = new SingleObject();


        private SingleObject(){}


        static SingleObject getInstance(){
            return instance;
        }
        void showMessage(){
            System.out.println("Hello World!");
        }
    }

    class SingletonPatternDemo {
        public static void main(String[] args) {


            SingleObject object = SingleObject.getInstance();
            SingleObject object2 = SingleObject.getInstance();


            object.showMessage();
            object2.showMessage();
        }
    }