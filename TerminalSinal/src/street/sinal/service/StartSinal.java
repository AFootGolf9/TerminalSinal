package street.sinal.service;

import street.sinal.repository.AjustTime;

public class StartSinal {
	public static void startSinal(String[] colors, int alert, int[] times) {
		times[0] = AjustTime.toMilli(times[0]);
		times[1] = AjustTime.toMilli(times[1]);
		times[2] = AjustTime.toMilli(times[2]);
		
		while (true) {
			normalCicle(colors, times);
			alertCicle(colors[alert], times);
		}
	}
	
	private static void normalCicle(String[] colors, int[] times) {
		for(int i = 0; i < times[3]; i ++) {
			System.out.println(colors[0]);
			try {
				Thread.sleep(times[0]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(colors[1]);
			try {
				Thread.sleep(times[1]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(colors[2]);
			try {
				Thread.sleep(times[2]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void alertCicle(String cor, int[] times) {
		for(int i = 0; i < times[4]; i ++) {
			System.out.println(cor);
			System.out.println();
			
			try {
				Thread.sleep(times[0]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(cor);
			System.out.println();
			
			try {
				Thread.sleep(times[1]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(cor);
			System.out.println();
			
			try {
				Thread.sleep(times[2]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
