package com.java.dp.mvcPattern;

public class StudentController {
	private StudentModel model;
	private StudentView view;

	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public String getStudentModelName() {
		return model.getName();
	}

	public void setStudentModelName(String name) {
		model.setName(name);
	}

	public String getStudentView() {
		return model.getRollNo();
	}

	public void setStudentView(String rollNo) {
		model.setRollNo(rollNo);
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
