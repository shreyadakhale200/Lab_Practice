package githubApplication;

public class Github_v1 extends Github implements IFeatures{
private int count=0;
	public Github_v1()
	{
		super();
	}
	
	public Github_v1(String username, String password)
	{
		super(username,password);
	}
	
	@Override
	public void Commit() {
		// TODO Auto-generated method stub
		System.out.println("Commited inside github");
		
	}

	@Override
	public void Clone() {
		// TODO Auto-generated method stub
		System.out.println("Cloned inside github");
		
	}

	@Override
	public void Push() {
		// TODO Auto-generated method stub
		System.out.println("Pushed inside github");
		
	}

	@Override
	public void Pull() {
		// TODO Auto-generated method stub
		System.out.println("Pulled from github");
		
	}
	

	@Override
	public void Signin() {
		// TODO Auto-generated method stub
		System.out.println("User Sign in Github");
		
	}

	@Override
	public void Signup() {
		System.out.println("User Sign out Github");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Login() {
		System.out.println("User Login Github");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		System.out.println("User Logout Github");
		
	}

	@Override
	public void ViewProfile() {
		// TODO Auto-generated method stub
		System.out.println("View Github Profile");
		
	}

	@Override
	public void EditProfile() {
		// TODO Auto-generated method stub
		System.out.println("Edit Github Profile");
		
	}

	@Override
	public void Registration() {
		// TODO Auto-generated method stub
		System.out.println("Register in Github using Google");
		
	}

	@Override
	public void Verification() {
		// TODO Auto-generated method stub
		System.out.println("Google Verification Process");		
	}

	public String toString()
	{
		return super.toString();
	}
	
}
