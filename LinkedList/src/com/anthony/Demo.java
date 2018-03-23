package com.anthony;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placestoVisit = new LinkedList<String>();
        addInOrder(placestoVisit, "Sydney");
        addInOrder(placestoVisit, "Sydney");
        addInOrder(placestoVisit, "Melbourne");
        addInOrder(placestoVisit,"Brisbane");
        addInOrder(placestoVisit,"Perth");
        addInOrder(placestoVisit,"Canberra");
        addInOrder(placestoVisit,"Adelaide");
        addInOrder(placestoVisit,"Darwin");

        printList(placestoVisit);
        addInOrder(placestoVisit,"Alice Springs");
        addInOrder(placestoVisit,"Darwin");
        printList(placestoVisit);

        visit(placestoVisit);

        //placestoVisit.add(1, "Alice Springs");


        //placestoVisit.remove(4);
        //printList(placestoVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            //used to find the start of the list
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new City should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on to next city}
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingforward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities int he itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit=true;
                    break;
                case 1:
                    if(!goingforward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingforward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingforward = false;
                    }
                    break;

                case 2:
                    if(goingforward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingforward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingforward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
