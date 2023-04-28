package eieght_week;

public class Course {

	String course; //과목
	Student[] student; //학생 
	int numOfStudent; //학생 수 
	
	public Course(String course) {
		this.course = course;
		this.student = new Student[20];
		this.numOfStudent =0;
	}
	
	public void addStudent(int id , String name , int one , int two , int three) {
		Student newstudent = new Student(id , name , one ,two ,three);
		student[numOfStudent] = newstudent;
		numOfStudent++;
	}
	
	public double getAverage() {
		double totalScore =0;
		
		for(int i =0; i<numOfStudent;i++ ) {
			totalScore+=student[i].getAverage();
		}
		return totalScore/numOfStudent;
	}
	public String toString() {
		return "교과목명: "+ course +"\n"+ student[0].toString()+"\n"+  student[1].toString()+ "\n"+ student[2].toString();
	}
	
	
	
}
