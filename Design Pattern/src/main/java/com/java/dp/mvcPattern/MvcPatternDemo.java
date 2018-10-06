package com.java.dp.mvcPattern;

public class MvcPatternDemo {
	/*
	 * Model - Model represents an object or JAVA POJO carrying data. It can
	 * also have logic to update controller if its data changes.
	 * 
	 * View - View represents the visualization of the data that model contains.
	 * 
	 * Controller - Controller acts on both model and view. It controls the data
	 * flow into model object and updates the view whenever data changes. It
	 * keeps view and model separate.
	 */
	public static void main(String[] args) {
		// fetch student record based on his roll no from the database
		StudentModel model = retrieveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);
		controller.updateView();

		// update model data
		controller.setStudentModelName("Jhon");

		controller.updateView();
	}

	private static StudentModel retrieveStudentFromDatabase() {
		StudentModel studentModel = new StudentModel();
		studentModel.setName("Robert");
		studentModel.setRollNo("10");
		return studentModel;
	}
}
