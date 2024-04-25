package githubApplication;
import java.util.Scanner;
public class SocialMedia_Utility {
	
	public static void AcceptDetails(SocialMedia[] sm)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<sm.length;i++)
		{
			int choice = sc.nextInt();
			System.out.println("Enter Email and Phone no to Verify for social media");
			System.out.println("Enter Email : ");
			String Email = sc.next();
			
			System.out.println("Enter Phone Number : ");
			String Phone = sc.next();
			System.out.println("1. Create Linked Account, 2. Create Github Account");
			switch(choice)
			{
			case 1:
//				private String Email;
//				private String Phone;
//				auto increment Linkedin_id;
//				private String Linkedin_username;
//				private String Linkedin_password;				
				System.out.println("Enter Linkedin Username : ");
				String Username = sc.next();
				
				System.out.println("Enter Linkedin Password : ");
				String Password = sc.next();
							
				sm[i] = new SocialMedia(){
						void UserDetails()
						{
							System.out.println(Username);
							System.out.println(Password);
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
						}
				};
						
				sm[i] = new Linkedin_v1(Username,Password);
				break;
			
			case 2:
//				private int github_id;
//				private String github_username;
//				private String github_password;
				
				System.out.println("Enter Github Username : ");
				String username = sc.next();
				
				System.out.println("Enter Github Password : ");
				String password = sc.next();
				
				sm[i] = new SocialMedia() {
					
					void UserDetails()
					{
						System.out.println(username);
						System.out.println(password);
					}
					@Override
					public void Verification() {
						// TODO Auto-generated method stub	
					}
					@Override
					public void Registration() {
						// TODO Auto-generated method stub
					}
					@Override
					public void Login() {
						// TODO Auto-generated method stub
					}
				};
				sm[i] = new  Github_v1(username,password);		
				break;
			}
				
		}
	}
	
	public static void DisplayDetails(SocialMedia[] sm)
	{
		for(int i=0;i<sm.length;i++)
		{
			System.out.println(sm[i]);
		}
	}

}
