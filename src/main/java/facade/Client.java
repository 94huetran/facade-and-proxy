package facade;

public class Client {
    public void share(String mess) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new Linkeld());
        socialMediaFacade.share(mess);
    }
}
