package com.testtimer;

import java.util.TimerTask;

/**
 * ʱ��:2019��2��12��
 * @author pefuxc
 *
 */
public class MyLoveLiLiThread extends TimerTask {

	private int a=0;
	@Override
	public void run() {
		a++;
		System.out.println("������"+a+"��");
	}

}
