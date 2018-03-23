package com.anthony;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {

    public static void main(String[] args) {

//        private ArrayList<Album> albums;

        Album album = new Album("Test");

        album.addSong("Hard days night", 1.56);
        album.addSong("Yellow Submarine", 2.45);
        album.addSong("Help", 6.15);

        System.out.println("Album " + album.getName());

        album.listSongs("Test");

    }


//    public boolean listSongs(String albumName){
//        Album checkalbum = new Album(albumName);
//        if(checkalbum != null){
//            System.out.println("Song Details for " + checkalbum.getName());
//            ArrayList<Song> albumSongs = checkalbum.getSongs();
//            for(int i=0; i<albumSongs.size(); i++){
//                Song song = albumSongs.get(i);
//                System.out.println("Song: " + song.getName() + ", duration" + song.getDuration());
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }

//    private Album findAlbum(String albumName) {
//        for(int i=0; i<this.album.size(); i++) {
//            Album checkedAlbum = this.album.get(i);
////            System.out.println("Finding " + branchName);
//            if(checkedAlbum.getName().equals(albumName)) {
////                System.out.println("Found " + checkedBranch.getName());
//                return checkedAlbum;
//            }
////            System.out.println("Unable to find " + branchName);
//        }
//        return null;
//    }


//    LinkedList<Album> albums = new LinkedList<Album>(Album);



//    private static void printList(LinkedList<Album> album){
//        Iterator<Album> i= album.iterator();
//        while (i.hasNext()) {
//            System.out.println("Now playing " + i.next());
//        }
//        System.out.println("==========================");
//    }
}
