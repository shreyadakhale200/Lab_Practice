package githubApplication;

public class Linkedin_v1 extends LinkedIn implements IFeatures{

	public Linkedin_v1()
	{
		super();
	}
	
	public Linkedin_v1(String Linkedin_username,String Linkedin_password)
	{
		super(Linkedin_username,Linkedin_password);
	}
	
	@Override
	public void UploadingResume() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void EducationalBackground() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddSkills() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddingSocialMediaLinks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Registration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Verification() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Linked Login");
		
	}

	@Override
	public void Signin() {
		// TODO Auto-generated method stub
		System.out.println("Linked Signin");
		
	}

	@Override
	public void Signup() {
		// TODO Auto-generated method stub
		System.out.println("Linked Signup");
		
	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		System.out.println("Linked Logout");
		
	}

	@Override
	public void ViewProfile() {
		// TODO Auto-generated method stub
		System.out.println("Linked ViewProfile");		
	}

	@Override
	public void EditProfile() {
		// TODO Auto-generated method stub
		System.out.println("Linked EditProfile");		
	}
	
	public String toString()
	{
		return super.toString();
	}

}
