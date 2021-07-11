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

		// Второй способ выполнение (4 пункт задания)
		NewPoint p3 = new NewPoint(1,1);
		NewPoint p4 = new NewPoint(4,5);
		System.out.println("Второй способ. Расстояние между точками с координатами ("+ p3.x + " ;"+ p3.y+") и " +
				"(" + p4.x + " ;"+ p4.y+") равно "+ distance(p3, p4));
		}
	public static double distance(Point p1, Point p2){
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}

	public static double distance(NewPoint p1, NewPoint p2){
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}

	}