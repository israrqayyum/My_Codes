import java.util.Scanner;
class PhoneDirectory{
    private String userName;
    private String userCNIC;
    private String userPhone;
    private String userAddress;
    public PhoneDirectory(String userName,String userCNIC,String userPhone,String userAddress){
        this.userName=userName;
        this.userCNIC=userCNIC;
        this.userPhone=userPhone;
        this.userAddress=userAddress;
    }
    public String getCNIC(){
        return this.userCNIC;
    }
    public void displayData(){
        System.out.println("---------Details---------");
        System.out.println("Name:\t"+this.userName);
        System.out.println("CNIC:\t"+this.userCNIC);
        System.out.println("Phone:\t"+this.userPhone);
        System.out.println("Address:"+this.userAddress);
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of users data:");
      int n=sc.nextInt();
      PhoneDirectory []ph=new PhoneDirectory[n];
      for(int i=0;i<n;i++){
       sc.nextLine();
       System.out.print("Enter Name "+(i+1)+":");
       String name=sc.nextLine();
       System.out.print("Enter CNIC:");
       String cnic=sc.next();
       System.out.print("Enter Phone no:");
       String phone=sc.next();
       System.out.print("Enter Address:");
       String address=sc.next();
       ph[i]=new PhoneDirectory(name,cnic,phone,address);
      }
      sc.nextLine();
      System.out.println("Enter CNIC to Search it:");
      String s=sc.next();
      boolean found = false;
      for(int i=0;i<n;i++)
      {
      if(s.equals(ph[i].getCNIC()))
       {
        ph[i].displayData();
        found = true;
        break;
       }
      }
      if(found==false) 
      {
      System.out.println("Not Found");
      }

    }
}
