package com.xworkz.app.impl;

import com.xworkz.app.repository.Artist;

public class Artistimpl implements Artist {
	private String[] art = new String[TOTAL_ARTISTS];
	private int position;
 
	@Override
	public void list(String artists) {
		System.out.println("atrists");
		if (this.position < TOTAL_ARTISTS) {
			this.art[position] = artists;
			System.out.println("Artist name " + artists + "position" + this.position);
			this.position++;
		} else {
			System.err.println("it is in out of space");
		}
	}

	public static void main(String[] args) {
		System.out.println("running ....");
		Artist arting = new Artistimpl();
 		arting.list("Sumanth");
		arting.list("karna");
		arting.list("lohith");
		arting.list("roman");
		arting.list("suchith");
		arting.list("kumara");
		arting.list("kohli");
		arting.list("vhran");
		arting.list("vikrant");
		arting.list("lohith");
		arting.list("aaaaa");
		arting.list("bbbb");
		arting.list("ccccc");
		arting.list("dddddd");

	}

}
