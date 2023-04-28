package eieght_week;

public class Student {
	int id; //학번
	String name;//이름
	int[] score; // 시험번호에 따른 시험점수 
	
	
	public Student(int id , String name , int one , int two ,int three) {
		this.id = id;
		this.name = name;
		this.score = new int[] {one , two ,three};
	}

	public void setScore(int number , int score) {
		this.score[number-1]= score;
	}
	
	public int getScore(int number) {
		return this.score[number-1];
	}
	
	public double getAverage() {
		double avg =(score[0] + score[1]+score[2])/3.0;
		return avg;
	}
	
	public String toString() {
		String prt = "학번: \t"+Integer.toString(this.id)+"\n이름: \t" +this.name +"\n시험점수1:\t "+ Integer.toString(this.score[0]) +"\n시험점수2:\t " +Integer.toString(this.score[1]) +"\n시험점수3:\t "+Integer.toString(this.score[2])+"\n\n평균점수:\t" + Double.toString(getAverage())+"\n";
		
		return prt;
	}
}
