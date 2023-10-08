package com.Array.Sorting;

public class Student {

	private int id;
	private String name;
	private String div;
	private float percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public Student(int id, String name, String div, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.div = div;
		this.percentage = percentage;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", div=" + div + ", percentage=" + percentage + "]";
	}
	
}
