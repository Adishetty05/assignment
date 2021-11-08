package com.sonata.override;

public class Student {
	String Name;
	int StdID;
	int Stdmarks;
	public Student() {}
	public Student(String stdname, int stdid, int stdmarks) {
		super();
		this.Name=stdname;
		this.StdID=StdID;
		this.Stdmarks=Stdmarks;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = Name;
	}
	public int getStdid() {
		return StdID;
	}
	public void setStdid(int stdid) {
		this.StdID = StdID;
	}
	public int getStdmarks() {
		return Stdmarks;
	}
	public void setStdmarks(int Stdmarks) {
		this.Stdmarks = Stdmarks;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", StdID=" + StdID + ", Stdmarks=" + Stdmarks + "]";
	}
	

	

}

