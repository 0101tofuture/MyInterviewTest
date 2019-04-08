package com.concurrent.volatiletest;
/**
 * ʱ��:2019��3��11��
 * @author pefuxc
 *
 */
public class VolatileTestNoAddVolatile {

	/**
	 * ������ٻ���һ��������
	 * 
	 * 1.����һ�� ���������߼���
	 *     ���ߣ��������ߡ���ַ���ߡ���������
	 *     lock
	 * 2.��������cpu���ٻ���һ����Э��
	 *    Inter  MESI    
	 *    volatile �ؼ��ֵ����ã�
	 *    ��һ��������volatile����ʱ����ǰ����̻߳���������߳�����������ڴ浱�еĻ��治�����ˣ��������߳���Ҫ�������ʱ��
	 *    ȥ�����ڴ浱��ȥȡ��
	 *     
	 */
	private static  int INIT_VALUE=0;
	private static final int LAST_VALUE=50;
	
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				while(INIT_VALUE<=LAST_VALUE){
					System.out.println("T1"+"�����"+"INIT_VALUE::"+INIT_VALUE++);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(INIT_VALUE<=LAST_VALUE){
					System.out.println("T2"+"�����"+"INIT_VALUE::"+INIT_VALUE++);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
