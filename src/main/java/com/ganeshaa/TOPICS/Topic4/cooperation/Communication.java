package com.ganeshaa.TOPICS.Topic4.cooperation;

class TotalEarning extends Thread{
	int total=0;
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total=total+100;
			}
			this.notify();
		}
	}
}

public class Communication {

	public static void main(String[] args) {
		TotalEarning te=new TotalEarning();
		te.start();
		synchronized (te) {
			try {
				te.wait();
				System.out.println(te.total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}

}
