package snippet;

import java.util.Scanner;

public class Snippet {
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        int num  = Integer.parseInt(scan.nextLine());
	        for(int j=0;j<num;j++){
	            for(int i=1;i<=num;i++){
	                System.out.print(i<num-j?" ":"#");
	            }
	            System.out.println("");
	        }
	        scan.close();
	    }
}

