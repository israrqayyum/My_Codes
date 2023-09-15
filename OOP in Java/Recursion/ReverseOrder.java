public class ReverseOrder{
  public static void rev(String str,int idx){
     if(idx==0){
       System.out.print(str.charAt(idx));
       return;
     }
     System.out.print(str.charAt(idx));
     rev(str,idx-1);
     // charAt(index)
  }
  public static void main(String args[]){
    String str="Time Complexity";
    rev(str,str.length()-1);
  }
}