package abstraction;

	public class Test extends Ab {

		public static void main(String[] args) {
			Ab c= new Test();// we created when inheritance happens
			c.one();
			c.two();
			//c.three(); we can't call child class methods 
			Test t=new Test();// if u want call child call method then u  need to create object of that class
			t.three();
		}
		public void three() {
			System.out.println("three in class child");
		}
		

		@Override
		public void two() {
			// TODO Auto-generated method stub
			System.out.println("this is two method in class child");
		}

	}


