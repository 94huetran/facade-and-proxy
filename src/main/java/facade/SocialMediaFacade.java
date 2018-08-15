package facade;

public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private Linkeld linkeld;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, Linkeld linkeld) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkeld = linkeld;
    }

    public void share(String mess) {
        twitter.setMessage(mess);
        facebook.setMessage(mess);
        linkeld.setMessage(mess);
        twitter.share();
        facebook.share();
        linkeld.share();
    }
}
