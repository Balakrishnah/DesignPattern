package com.java.dp.momento;

public class FileWriterUtil {
private String fileName;
private StringBuilder content;

public FileWriterUtil(String fileName) {
	this.fileName = fileName;
	this.content = new StringBuilder();
}

@Override
public String toString() {
	return this.content.toString();
}

public void write(String str){
	content.append(str);
}
public Momento save(){
	return new Momento(this.fileName, this.content);
}
public void undoToLastSave(Object obj){
	Momento momento = (Momento) obj;
	this.fileName = momento.fileName;
	this.content = momento.content;
}
private class Momento{
	private String fileName;
	private StringBuilder content;
	
	public Momento(String fileName, StringBuilder content) {
		this.fileName = fileName;
		//notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
		this.content = new StringBuilder(content);
	}
	
}
}
