class AccountUser{
      private long acc_no;
      private String UserName;
      private String email;
      private float amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
       
}

class EncapsulationBank{
     public static void main(String args[]){
     AccountUser u=new AccountUser();
     u.setAcc_no(5637234);
     u.setUserName("Nikita");
     u.setEmail("Nikita@gmail.com");
     u.setAmount(45000f);
     System.out.println("User Details :"+u.getAcc_no()+" "+u.getUserName()+" "+u.getEmail()+" "+u.getAmount());



}





}