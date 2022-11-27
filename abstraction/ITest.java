package abstraction;

	public class ITest implements I  {
		public static void main(String[] args) {
			I i =new ITest();
			i.one();
			i.two();
			System.out.println(i.a);
			
		}

		@Override
		public void one() {
			System.out.println("this is one in child intest");
			// TODO Auto-generated method stub
			
		}

		@Override
		public void two() {
			System.out.println("this is two in child intest");
			// TODO Auto-generated method stub
			
		}
}
