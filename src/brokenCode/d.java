package brokenCode;

public class d {

		
		public  static void  main(String[] args) {
			double tempOne=84.7;
			 int tempTwo =66;
			
			String result;
			if (tempOne <= 0 && tempTwo>=100) {
				System.out.println("true");
				
			}  else if  (tempOne>= 100 && tempTwo <= 0) {
				System.out.println(" true");
			} else {
				System.out.println(" false");
			}
			
			System.out.println("results");
			
			String season = "Monday";

			switch ("fall") {
			case "fall":
				System.out.println("Recovering from hot weather");
				break;
			case "winter":
				System.out.println("Toooo cold");			
				 break;
			case "s":
				System.out.println("Recovering from cold weather");			
				break;
			case "summer":
				System.out.println("Toooo hot");			
				 
			default:
				System.out.println("Season does not exist!");	
			}
			
			
			for(int x=1; x <10; x++){
				
				if (x >= 5) {
					System.out.println("i equals to 5");
				} else {
					System.out.println("i not equals");
				}
			}
			
	}

	
		
		
		
	 

	}



