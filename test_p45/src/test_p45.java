
public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("1����");
		car1.start();
		Car car2 = new Car("2����");
		car2.start();
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}
class Car extends Thread{
	private String name;
	public Car(String nm) {
		name = nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}