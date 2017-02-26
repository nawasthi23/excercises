package percolation;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class AllConnected {
	int[]  arr=null;
	int sizeArr[]=null;
	public AllConnected(int n) {
		arr =new int[n];
		sizeArr=new int[n];
		for (int i=0;i<n;i++){
			arr[i]=i;
			sizeArr[i]=1;
		}
	}
	
	public static void main(String[] args) {
		/*int m=10;
		AllConnected ac=new AllConnected(10);
		Console c=System.console();
		while(true){
			String str=c.readLine();
			if(str.equalsIgnoreCase("done")){
				break;
			}
			String[] sa=str.split(" ");
			ac.union(new Integer(sa[1]),new Integer(sa[2]));
			if(ac.isAllConnected()){
				System.out.println(sa[0]);
				break;
			}
		}*/
		
		
		Socket Skt;
        String host = "209.253.205.102";
        int i = 2220; // port no.

             try {
                System.out.println("Looking for "+ i);
                Skt = new Socket(host, i);
                System.out.println("There is a Server on port "
                + i + " of " + host);
             }
             catch (UnknownHostException e) {
                System.out.println("Exception occured"+ e);

             }
             catch (IOException e) {
                 System.out.println("port is not used");

             }
	}
	
	private boolean isAllConnected() {
		return false;
	}

	private void union(Integer integer, Integer integer2) {
		
		
	}
}
