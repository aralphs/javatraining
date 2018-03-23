package com.anthony;

import java.util.ArrayList;

public class Album {

    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Boolean addSong(String songName, double duration){
            this.songs.add(new Song(songName, duration));
            System.out.println("Song " + songName + " has been added to album " + getName());
    }

    public boolean listSongs(String albumName){
        Album checkalbum = findAlbum(albumName);
        if(checkalbum != null){
            System.out.println("Song Details for album " + checkalbum.getName());
            ArrayList<Song> albumSongs = checkalbum.getSongs();
            System.out.println("we are here ");
            for(int i=0; i<albumSongs.size(); i++){
                System.out.println("In the loop");
                Song song = albumSongs.get(i);
                System.out.println("Song: " + song.getName() + ", duration" + song.getDuration());
            }
            return true;
        } else {
            System.out.println("We have failed");
            return false;
        }
    }

        private Album findAlbum(String albumName) {
//        for(int i=0; i<this.songs.size(); i++) {
            Album checkedAlbum = Album(albumName);
////            System.out.println("Finding " + branchName);
            if(checkedAlbum.getName().equals(albumName)) {
//                System.out.println("Found " + checkedBranch.getName());
                return checkedAlbum;
            }
            return null;
//            System.out.println("Unable to find " + branchName);
        }




}
