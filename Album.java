public class Album {

public String name;
public String artist;
public int songs;
public double playTime;

public Album(String name, String artist, int songs, double playTime){
    this.name = name;
    this.artist = artist;
    this.songs = songs;
    this.playTime =  playTime;

}

    public String name(){
        return name;

    }
    public String  artist(){
        return artist;

    }
    public int songs() {
        return songs;
    }
    public double playTime(){
    return playTime;
    }
   public String toString(){
    String info = "Name:"+ name + "\n" + "Artist:"+ artist +"\n"+ "Number of Songs:"+ songs +"\n"+ "Play time:"+ playTime +"\n";
            return info;

   }

}
