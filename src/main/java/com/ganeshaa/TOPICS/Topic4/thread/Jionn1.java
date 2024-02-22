package com.ganeshaa.TOPICS.Topic4.thread;

class Venue extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Venue ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
	}
}
class Card extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Card : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Distribution extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Distribution : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Jionn1 {
	public static void main(String[] args) throws InterruptedException {
		Venue venue = new Venue();
		venue.start();
		
		venue.join();
		Card card = new Card();
		card.start();
		
		card.join();
		Distribution distribution= new Distribution();
		distribution.start();
	}
}
