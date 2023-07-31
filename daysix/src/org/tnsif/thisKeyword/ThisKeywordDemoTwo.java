
		//This can be passed as argument in the constructor call
     package org.tnsif.thisKeyword;

		public class ThisKeywordDemoTwo {
			//default variable
			int x,y;
			
			 public ThisKeywordDemoTwo (int x,int y)
			{
				 //we can change the parameter name
				this.x=x;
				this.y=y;
				
				
			}
			 
			 void display()

			 {
				 System.out.println(x+" "+y);
			 }
			 
			public static void main(String[] args) {
				ThisKeywordDemoTwo t=new ThisKeywordDemoTwo(2,3);
				
				
				t.display();

			}

		}

		
