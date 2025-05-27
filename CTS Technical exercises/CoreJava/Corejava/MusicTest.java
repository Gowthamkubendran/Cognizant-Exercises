interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar sounds: Strum strum");
    }
}
class Piano implements Playable {
    public void play() {
        System.out.println("Piano sounds: Plink plink");
    }
}
public class MusicTest {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();
    }
}