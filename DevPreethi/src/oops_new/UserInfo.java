package oops_new;

public class UserInfo extends UserClass{
		 String address;

		  public UserInfo(String name, String mobileNumber,String address){
			  super(name,mobileNumber);
			  System.out.println("Coming back to UserInfo Constructor");
			this.address = address;
		}
		public void userDetails(){
			System.out.println("User name is : " + UserClass.name);
			System.out.println("User mobile Number is : "+UserClass.mobileNumber);
			System.out.println("User address is : "+address);
		}
		}


