import java.util.Scanner;
class Email{
  private String domainName;
  public Email(String domainName){
    this.domainName = domainName;
  }
  public void setDomainName(String s){
    domainName = s;
  }
  public String getDomainName(){
    return domainName;
  }
  //METHOD TO CHECK @ SIGN AND TWO DOT OPERATORS
  public String checkSyntax(){
    if(domainName.contains("@") && domainName.indexOf(".") > domainName.indexOf("@") &&domainName.lastIndexOf(".") > domainName.indexOf(".")) {
      return "valid address";
    }
    else{
      return "invalid address";
    }
  }
  public String checkExtension(){
    if(domainName.contains(".edu")){
      return "edu";
    }
    else{
      return "unknown";
    }
  }
  public String getUniversityName(){
    int atSignIndex=domainName.indexOf("@") + 1;
    int dotIndex=domainName.indexOf(".");
    return domainName.substring(atSignIndex,dotIndex);
  }
}

public class Test {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter an email address: ");
  String domainName = scanner.nextLine();
  Email email = new Email(domainName);
  System.out.println("Syntax Check: " + email.checkSyntax());
  System.out.println("Extension: " + email.checkExtension());
  System.out.println("University Name: "+ email.getUniversityName());
  }
}