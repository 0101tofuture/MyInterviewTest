package com.testtimer;

import java.util.Date;
import java.util.Timer;

/**
 * ʱ��:2019��2��12��
 * @author pefuxc
 * ����ʱ�������
 */
public class TestTimer {

	public static void main(String[] args) {
		Timer aTimer=new Timer(); 
		MyLoveLiLiThread aMyLoveLiLiThread=new MyLoveLiLiThread();
		aTimer.schedule(aMyLoveLiLiThread, new Date(),1000*1);
	}
}
