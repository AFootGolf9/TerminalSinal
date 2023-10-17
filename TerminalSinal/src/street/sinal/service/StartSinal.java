package street.sinal.service;

import street.sinal.repository.AjustTime;

public class StartSinal {
	public static void startSinal(String[] cores, int alerta, int[] tempos) {
		tempos[4] = AjustTime.toMilli(tempos[4]);
		tempos[5] = AjustTime.toMilli(tempos[5]);
		while (true) {
			normalCicle(cores, tempos);
			alertCicle(cores[alerta], tempos);
		}
	}
	
	private static void normalCicle(String[] cores, int[] tempos) {
		for(int i = 0; i < tempos[4]; i ++) {
			System.out.println(cores[0]);
			try {
				Thread.sleep(tempos[0]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(cores[1]);
			try {
				Thread.sleep(tempos[1]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(cores[2]);
			try {
				Thread.sleep(tempos[2]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void alertCicle(String cor, int[] tempos) {
		for(int i = 0; i < tempos[5]; i ++) {
			System.out.println(cor);
			System.out.println();
			
			try {
				Thread.sleep(tempos[0]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(cor);
			System.out.println();
			
			try {
				Thread.sleep(tempos[1]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(cor);
			System.out.println();
			
			try {
				Thread.sleep(tempos[2]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
