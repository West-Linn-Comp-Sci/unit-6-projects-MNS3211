public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("YO","MR. Nice",8,30);
        Album a2 = new Album("NotAGAIN","Homer",4,12.20);
        Album a3 = new Album("Rags2Riches","HypeGuRu",21,60);
        Album a4 = new Album("lovxrs","weirdC",7,21);
        Album a5 = new Album("TKO","PunchMan",12,16);


        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a5);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleCapacity();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(a1,0);
        myLibrary.add(a3);
        myLibrary.add(a4);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}