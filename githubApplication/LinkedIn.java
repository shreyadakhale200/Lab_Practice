package githubApplication;

public abstract class LinkedIn extends SocialMedia {
	private int Linkedin_id;
	private String Linkedin_username;
	private String Linkedin_password;
	private int count = 0;
	
	public abstract void UploadingResume();
	public abstract void EducationalBackground();
	public abstract void AddSkills();
	public abstract void AddingSocialMediaLinks();
	
	public LinkedIn()
	{
		Linkedin_id = 0;
		Linkedin_username = "NA";
		Linkedin_password = "NA";
	}
	
	public LinkedIn(String Linkedin_username,String password)
	{
		this.Linkedin_id = count++;
    	this.Linkedin_username = Linkedin_username;
		this.Linkedin_password = password;
	}
	
	public String toString()
	{
		return "Linkedin ID = " + Linkedin_id +
			   ", Linkedin Username = " + Linkedin_username + 
			   ", Linkedin Password = " + Linkedin_password + ", " + super.toString();
	}
}
