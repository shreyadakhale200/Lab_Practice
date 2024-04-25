package githubApplication;

public class Client {

    public static void main(String[] args) {
        // Create an array of SocialMedia references
        SocialMedia[] s = new SocialMedia[2];

        // Call AcceptDetails to populate the array
        SocialMedia_Utility.AcceptDetails(s);

        // Display the details of the social media accounts
        SocialMedia_Utility.DisplayDetails(s);
    }

}
