
public class test_p50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("�@����");
		Thread th1 = new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}
class Car implements Runnable{
	private String name;
	public Car(String nm) {
		name = nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z");
		}
	}
}