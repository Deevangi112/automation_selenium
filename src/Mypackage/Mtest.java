package Mypackage;

public class Mtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Test m1 =new Test();
       m1.openBrowser();
       System.out.println(" Open Browser methode call");
       
       m1.merchantdemo();
       System.out.println("merchant demo methode call");
       m1.OTPR();
       System.out.println("OTR methode call ");
       m1.AdminPage();
       System.out.println("AdminPage methode call ");
       m1.DPPage();
       System.out.println("DPPage methode call ");


       

       
	}

}
