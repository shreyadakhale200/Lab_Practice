package githubApplication;

public abstract class SocialMedia {
	private String Email;
	private String Phone;
	
	public abstract void Registration();
	public abstract void Verification();
	public abstract void Login();
	
	public SocialMedia()
	{
		Email = "NA";
		Phone = "NA";
	}
	
	public SocialMedia(String Email, String Phone)
	{
		this.Email = Email;
		this.Phone = Phone;
	}
	
	public String toString()
	{
		return "User Email : " + Email + 
			   ", User Phone no : " + Phone;
	}
	

}
