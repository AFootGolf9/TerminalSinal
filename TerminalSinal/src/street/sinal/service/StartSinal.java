package street.sinal.service;

import street.sinal.repository.AjustTime;

public class StartSinal {
	public static void startSinal(String[] colors, int alert, int[] times) {
		times[0] = AjustTime.toMilli(times[0]);
		times[1] = AjustTime.toMilli(times[1]);
		times[2] = AjustTime.toMilli(times[2]);
		
		while (true) {
			normalCicle(colors, times);
			alertCicle(colors[alert], times[alert], times[4]);
		}
	}
	
	private static void normalCicle(String[] colors, int[] times) {
		for(int i = 0; i < times[3]; i ++) {
			for(int j = 0; j < 3; j ++) {
				System.out.println(colors[j]);
				System.out.println();
				
				try {
					Thread.sleep(times[j]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void alertCicle(String cor, int time, int rounds) {
		for(int i = 0; i < rounds; i ++) {
			System.out.println(cor);
			System.out.println();
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
