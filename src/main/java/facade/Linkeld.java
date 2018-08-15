package facade;

public class Linkeld implements SocialShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Message in Linkeln: " + message);
    }
}
