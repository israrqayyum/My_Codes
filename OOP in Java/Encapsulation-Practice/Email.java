import java.util.Scanner;
class Email {
 private String domainName;
 Email(String Email) {
     this.domainName=Email;
 }
 
 public String getEmail() {
    return this.domainName;
 }
 
 public String rateSyntax() { 
    if(!domainName.contains("@")) {
        return "Invalid";
    } else {
        return "Valid";
    }
 }
 
 public String dotSyntax() {
    if(domainName.contains(".") && domainName.indexOf(".")>domainName.indexOf("@")) {
        return "Valid";
    } 
    else {
        return "Invalid";
    }
 }
 
 public String lastDotSyntax() {
    int dotIndex=domainName.indexOf(".");
    if(domainName.contains(".") && domainName.lastIndexOf(".")> dotIndex) {
        return "Valid";
    } 
    else {
        return "Invalid";
    }
 }
 
 public Boolean extension() {  
    int dotIndex=domainName.indexOf(".");
    int lastDotIndex=domainName.lastIndexOf(".");
    if(domainName.contains(".") && domainName.lastIndexOf(".")> dotIndex){
        String r=domainName.substring(dotIndex+1,lastDotIndex);
        return true;
    } 
    else {
        return false;
    }
 }
 
 public String extensioncheck() {
    int dotIndex=domainName.indexOf(".");
    int lastDotIndex=domainName.lastIndexOf(".");
    String rw=domainName.substring(dotIndex+1,lastDotIndex);
    return rw;
 }
 
 public String uniName() {
    int rateIndex=domainName.indexOf("@");
    int dotIndex=domainName.indexOf(".");
    String r=domainName.substring(rateIndex+1,dotIndex);
    return r;
 }
 
 public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Educational Email Address:");
    String Email=sc.next();
    Email E=new Email(Email);
    System.out.println("Email Verification Check");
    System.out.println("\tchecking (@) sign....:"+E.rateSyntax());
    System.out.println("\tchecking (.) sign....:"+E.dotSyntax());
    System.out.println("\tchecking (.) sign....:"+E.lastDotSyntax());
    if(E.rateSyntax()=="Valid" && E.dotSyntax()=="Valid" && E.lastDotSyntax()=="Valid") {
        System.out.println("You Entered Educational Email Address");
        } 
        else {
        System.out.print("Your Entered Email Address is not work or school Email\n");
        }
        if(E.extension()==true) {
        System.out.println("Extension is:"+E.extensioncheck());
        } 
        else {    
        System.out.println("Extension is not Found");
        } 
        System.out.println("University Name is:"+E.uniName());
    }
}