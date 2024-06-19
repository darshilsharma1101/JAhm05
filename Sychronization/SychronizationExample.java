package Sychronization;

public class SychronizationExample {
		public static void main(String[] args) {
		     Increment ic = new Increment();
		     
		     Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
				
					for(int i=0;i<1000;i++) {
						ic.get_Increment();
						 
					}
					
				}
			});
		     
		    
		     Thread t2 = new Thread(new Runnable() {
		 		
		 		@Override
		 		public void run() {
		 		
		 			for(int i=0;i<2000;i++) {
		 				ic.get_Increment();
		 				 
		 			}
		 			
		 		}
		 	});
		     
		     
		     
		     
		     t1.start();
		     t2.start();
		     //ic.get_Increment();
		     
		     try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		     
		     
		     System.out.println(ic.cnt);
		    		 
			}

	}

