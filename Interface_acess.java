package com.java;

public class Interface_acess implements Interface_Class {
	public	static void main(String[] args) {
		Interface_Class abc=new Interface_acess();
		abc.pancMandatory();
		Interface_Class.collegecertificate();
		abc.schoolc_certificate();
	}

	@Override
	public void pancMandatory() {
		System.out.println(Interface_Class.a);
		System.out.println("pancard added");
	}

	@Override
	public void schoolc_certificate() {
		System.out.println("school certificate added");		
	}

}
