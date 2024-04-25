package githubApplication;

public abstract class Github extends SocialMedia{
	private int github_id;
	private String github_username;
	private String github_password;
	private static int count = 0;
	
	public abstract void Commit(); 
	public abstract void Clone();
	public abstract void Push();
	public abstract void Pull();
	
	public Github()
	{
		github_id = 0;
		github_username = "NA";
		github_password = "NA";
	}
	
	public Github(String github_username,String password)
	{
		count++;
		github_id = count;
		this.github_username = github_username;
		this.github_password = password;
	}
	public String toString()
	{
		return " Github ID = " + github_id + 
			   ", Github Username = " + github_username + 
			   ", Github Password = " + github_password + ", " + super.toString();
	}
}
