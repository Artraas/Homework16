package exercise3;

interface Playable {
    void play();
    void pause();
    void stop();
}
interface Recodable {
    void record();
    void pause();
    void stop();
}
public class Player implements Playable, Recodable{

    public static void main(String[] args) {
        Playable play = new Player();
        play.play();
        play.pause();
        play.stop();

        Recodable record = new Player();
        record.record();
        record.pause();
        record.stop();
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}