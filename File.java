package com.xworkz.oopsconcepts;

public class File {

	String filename;
	String filepath;
	int storagespace;
	String format;
	int filesize;

	public void open() {
		System.out.println("open the file");
	}

	public void read() {
		System.out.println("read the file");
	}

	public void write() {
		System.out.println("write the file");
	}
}
