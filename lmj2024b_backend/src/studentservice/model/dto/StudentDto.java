package studentservice.model.dto;

public class StudentDto {

	// 멤버변수
	private int sno;		// 학생번호(식별)
	private String sname;	// 학생명
	private int kscore;		// 국어점수
	private int escore;		// 영어점수
	private int mscore;		// 수학점수
	
	// 생성자
	public StudentDto() {}
	public StudentDto(int sno, String sname, int kscore, int escore, int mscore) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.kscore = kscore;
		this.escore = escore;
		this.mscore = mscore;
	}
	// 점수등록에 접합한 생성자
	public StudentDto(String sname, int kscore, int escore, int mscore) {
		this.sname = sname;
		this.kscore = kscore;
		this.escore = escore;
		this.mscore = mscore;
	}
	// 점수수정에 적합한 생성자
	public StudentDto(int kscore, int escore, int mscore) {
		super();
		this.kscore = kscore;
		this.escore = escore;
		this.mscore = mscore;
	}

	// 메소드
	@Override
	public String toString() {
		return "StudentDto [sno=" + sno + ", sname=" + sname + ", kscore=" + kscore + ", escore=" + escore + ", mscore="
				+ mscore + "]";
	};
	
	public int getSno() {
		return sno;
	}

	public void setSno( int sno ) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getKscore() {
		return kscore;
	}

	public void setKscore(int kscore) {
		this.kscore = kscore;
	}

	public int getEscore() {
		return escore;
	}

	public void setEscore(int escore) {
		this.escore = escore;
	}

	public int getMscore() {
		return mscore;
	}

	public void setMscore(int mscore) {
		this.mscore = mscore;
	}
	
} // c end
