package ru.stqa.raiff.sandbox;

public class MyFirstClass{
	
	public static void main(String[] args){

		Point p1 = new Point();
		Point p2 = new Point();
		p1.x = 1;
		p1.y = 1;
		p2.x = 4;
		p2.y = 5;
		System.out.println("Расстояние между точками с координатами ("+ p1.x + " ;"+ p1.y+") и " +
				"(" + p2.x + " ;"+ p2.y+") равно "+ distance(p1, p2));
		}
	public static double distance(Point p1, Point p2){
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}

	}