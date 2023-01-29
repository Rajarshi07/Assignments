package day6_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GenericList <T> {
	ArrayList<T> l;

	public GenericList() {
		// TODO Auto-generated constructor stub
		this.l = new ArrayList<T>();
	}

	private void insert(T e) {
		// TODO Auto-generated method stub
		l.add(e);
//		System.out.println("Added");
	}

	private void display() {
		// TODO Auto-generated method stub
//		for(T i:l) {
//			System.out.println(i);
//		}
		Iterator<T> itr=l.iterator();
		while(itr.hasNext())System.out.println(itr.next());
	}



	public static void main(String[] args) {
//		Testing here
		GenericList<String> a=new GenericList<String>();
		a.insert("A");
		a.insert("B");
		a.insert("C");
		a.insert("D");
		a.insert("E");
		a.insert("F");
		a.insert("G");
		a.insert("H");
		a.display();
		GenericList<Integer> b=new GenericList<Integer>();
		b.insert(1);
		b.insert(2);
		b.insert(3);
		b.insert(4);
		b.insert(5);
		b.display();
		GenericList<Float> c=new GenericList<Float>();
		c.insert(1f);
		c.insert(2f);
		c.insert(3f);
		c.insert(4f);
		c.insert(5f);
		c.display();
		GenericList<Double> d=new GenericList<Double>();
		d.insert(1.5);
		d.insert(2.5);
		d.insert(3.5);
		d.insert(4.5);
		d.insert(5.5);
		d.display();
		
		
	}
}
