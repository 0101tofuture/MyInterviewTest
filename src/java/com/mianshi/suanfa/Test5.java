package com.mianshi.suanfa;
/**
 * 
 * 
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 * ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * ʱ��:2019��2��18��
 * @author pefuxc
 *
 */
public class Test5 {
	public int minNumberInRotateArray(int [] array) {
		if(array.length==0){
			return 0;
		}
		//ͨ���������������еõ���Сֵ
		int start=0,end=array.length,mid=0;
		while(start<end){
			mid=(start+end)/2;
			if(array[start]>array[mid]){
				
			}
		}
		return mid;
    }
}
