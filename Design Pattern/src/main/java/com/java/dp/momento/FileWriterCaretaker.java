package com.java.dp.momento;

public class FileWriterCaretaker {
	private Object obj;

	public void save(FileWriterUtil util) {
		this.obj = util.save();
	}

	public void undo(FileWriterUtil fileWriter) {
		fileWriter.undoToLastSave(obj);
	}
}
