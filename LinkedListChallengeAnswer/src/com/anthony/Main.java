package com.anthony;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("American Dream", "LCD Soundsystem");
        album.addSong("Oh Baby", 4.2);
        album.addSong("Tonite", 3.4);
        album.addSong("Other voices", 2.4);
        album.addSong("call the police", 1.2);
        album.addSong("i used to", 10.2);
        album.addSong("american dream", 5.4);
        album.addSong("change yr mind", 6.5);
        album.addSong("emotional haircut", 3.5);
        album.addSong("how do you sleep", 6.7);
        album.addSong("black screen", 7.3);

        albums.add(album);

        album = new Album("Drunk", "Thundercat");
        album.addSong("Track 1", 4.2);
        album.addSong("Track 2", 3.4);
        album.addSong("Track 3", 2.4);
        album.addSong("Track 4", 1.2);
        album.addSong("Track 5", 10.2);
        album.addSong("Track 6", 5.4);
        album.addSong("Track 7", 6.5);
        album.addSong("Track 8", 3.5);
        album.addSong("Track 9", 6.7);
        album.addSong("Track 10", 7.3);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Oh Baby", playList);
        albums.get(0).addToPlayList("i used to", playList);
        albums.get(0).addToPlayList("Blue screen", playList); // does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(12, playList); // There is no track 12


        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println(("Now playing " + listIterator.next().toString()));
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println(("Now playing " + listIterator.previous().toString()));
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else{
                            System.out.println("We have reached the end of the list");
                        }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
        "1 - to play next song\n" +
        "2 - to play previous song\n" +
        "3 - to replay the current song\n" +
        "4 - list songs in the playlist\n" +
        "5 - print available actions\n" +
        "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================================");
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }


}
