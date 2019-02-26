package com.ttn.collections;


import java.util.Scanner;
import java.util.Stack;

public class Question7 {
        public static void main(String[] args) {
            SpecialStack specialStack = new SpecialStack();
            Scanner scanner = new Scanner(System.in);
            //char ch;
            do {
                System.out.println("Stack Operations");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Check Empty");
                System.out.println("5. Get Minimum");
                System.out.println("6. Exit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter integer element to push");
                        specialStack.push(scanner.nextInt());
                        break;
                    case 2:
                        System.out.println("Popped Element = " + specialStack.pop());
                        break;
                    case 3:
                        System.out.println("Peek Element = " + specialStack.peek());
                        break;
                    case 4:
                        System.out.println("Empty status = " + specialStack.isEmpty());
                        break;
                    case 5:
                        System.out.println("Minimum Element = " + specialStack.getMin());
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Wrong Entry \n ");
                        break;
                }
            } while (true);
        }
    }


    class SpecialStack extends Stack<Integer> {
        Stack<Integer> minStack;

        //    Initializing minStack
        public SpecialStack() {
            minStack = new Stack<>();
        }


        @Override
        public Integer push(Integer item) {
            if (minStack.empty()) {
                minStack.push(item);
            } else if (minStack.peek() > item)
                minStack.push(item);
            return super.push(item);
        }


        @Override
        public synchronized Integer pop() {
            if (super.peek().equals(minStack.peek()))
                minStack.pop();
            return super.pop();
        }


        Integer getMin() {
            return minStack.peek();
        }
    }

