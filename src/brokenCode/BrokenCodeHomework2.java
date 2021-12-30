package brokenCode;

public class BrokenCodeHomework2 {
//	public class BrokenCodeTwo {//duplicate main
		
		public  static void main(String[] args) {// static and void misplaced string S should be captal letter
			double tempOne=84.7;// the number is not int type of data,should be double
			 int tempTwo =66;
			
			String result;
			if (tempOne <=  0 && tempTwo  >= 100){//semicollon after bracket end the logical operater should be 2(&&) ,and greater than >=, for int data type no need double qoutation 
			System.out.println( true);//to print resulat java use Systetem.out.println and true is string should be in doubel quotation mark
			}  else if  (tempOne>= 100 && tempTwo <= 0) { //if else misplaced
				System.out.println( true);//o print resulat java use Systetem.out.println
			} else {
				System.out.println( "true");//o print resulat java use Systetem.out.println
			}
			
			System.out.println("results");//result should be in double quotation mark
			
			String season = "Monday";

			switch (season="fall") {// variable in switch can not put boolean 
			case"fall"://at the end should be colon fall should be in double quation mark
				System.out.println("Recovering from hot weather");
				break;
			case "winter":
				System.out.println("Toooo cold");			
				 
			case "s"://at the end should be colon we declar string  all case should be the same data type
				System.out.println("Recovering from cold weather");			
				break;
			case "summer"://at the end should be colon
				System.out.println("Toooo hot");			
				 
			default://at the end should be colon
				System.out.println("Season does not exist!");	
			}
			
			
			for(int i=0; i<10; i++){// for and int are capital leter should be small letter i is not decleard semiolon between boolean and expresstion
				
				if (i>=5) { //no no bracket only one , no smicolon, == use for string data type
					System.out.println("I equals to 5");// semi colon at end
				} else {//no need to open bracket
					System.out.println("i not equals");// should be double qoutation mark"
		
					
						}
					}
					
			}

			
				
				
				
			 

			}
		
	 

	






