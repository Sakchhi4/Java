abstract class Media {
    private String title;
    private int duration;
    protected boolean isPremium;

    Media(String t, int d, boolean p) {
        title = t;
        duration = d;
        isPremium = p;
    }

    public String getTitle() {
        return title;
    }

    abstract void playContent();
}

class Movie extends Media {
    Movie(String t, int d, boolean p) {
        super(t, d, p);
    }

    void playContent() {
        if (isPremium) {
            System.out.println("Verifying Subscription...");
        }
        System.out.println("Streaming Movie: " + getTitle());
    }
}

class Podcast extends Media {
    Podcast(String t, int d) {
        super(t, d, false);
    }

    void playContent() {
        System.out.println("Loading Advertisement...");
        System.out.println("Playing Podcast: " + getTitle());
    }
}

public class ok {
    public static void main(String[] args) {
        Media[] m = {
            new Movie("Inception", 148, true),
            new Podcast("Tech Talk", 30),
            new Movie("Free Guy", 115, false)
        };

        for (Media x : m) {
            x.playContent();
        }
    }

