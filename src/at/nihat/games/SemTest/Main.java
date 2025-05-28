package at.nihat.games.SemTest;

public class Main {
    public static void main(String[] args) {

        AudioBook audioBook1 = new AudioBook(1, 15, "Die schwarze Nacht", "sehr spannend");
        audioBook1.playSample();
        AudioBook audioBook2 = new AudioBook(2, 17, "Die Schule", "mitreißend");

        Novel novel = new Novel(11, 40, "Das dunkle Meer", "atemberaubend", "Thriller");
        novel.getGenre();



        LibaryManager libaryManager = new LibaryManager();
        libaryManager.addMedia(novel);
        libaryManager.addMedia(audioBook1);
        libaryManager.addMedia(audioBook2);


        libaryManager.calculateTotalMediaValue();
        libaryManager.getAllMedia();



    }
}
