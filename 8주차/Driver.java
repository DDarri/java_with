package eieght_week;

public class Driver {

	public static void main(String[] args) {
		Course java = new Course("자바프로그래밍\n");
		
		java.addStudent(7101, "홍길동", 96, 87, 92);
		java.addStudent(7106, "김갑돌", 72, 90, 78);
		java.addStudent(7132, "이갑순", 63, 84, 82);
		
		System.out.println(java.toString());
		System.out.println("교과목 전체 평균 \t" + java.getAverage());
		
	}

}
