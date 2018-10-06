package com.java.dp.momento;

public class MomentoDemo {
	/*Reference link: https://www.journaldev.com/1734/memento-design-pattern-java
	 * Memento design pattern is implemented with two objects-Originator and Caretaker
	  */

	public static void main(String[] args) {
	FileWriterCaretaker caretaker = new FileWriterCaretaker();
	FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
	fileWriter.write("First set of Data\n");
	System.out.println(fileWriter +"\n\n");
	
	// lets save the file
	caretaker.save(fileWriter);
	
	//now write something else
	fileWriter.write("Second set of Data \n");
	
	//checking file contents
	System.out.println(fileWriter+"\n\n");
	
	//lets undo to last save
	caretaker.undo(fileWriter);
	
	//checking file content again
	System.out.println(fileWriter+"\n\n");
	}

}
