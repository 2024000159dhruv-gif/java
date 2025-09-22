package dhruv;

public class mtdcall{
	public void Say()
	{
		String msg = getmessage();
		System.out.println(msg);
	}
	
     private String getmessage() {
	        return "HELLO HII THIS THAT BLAH BLAHH BLUU BLII ";
     }
  public static void main (String[] args) {
	  mtdcall n = new mtdcall();
	  n.Say(); 
  }
}
