package com.mianshi.suanfa;
/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * ʱ��:2019��2��15��
 * @author pefuxc
 *
 */
public class Test1 {
    public static String replaceSpace(StringBuffer str) {
    	String result="";
    	String aData=str.toString();
    	result=aData.replaceAll("\\s+", "%20");
		return result;
    }
    public static void main(String[] args) {
		StringBuffer aStringBuffer=new StringBuffer("We Are Happy");
		System.out.println(replaceSpace2(aStringBuffer));
	}
    public static String replaceSpace2(StringBuffer str) {
    	String result="";
    	String aData=str.toString();
    	char[] array=aData.toCharArray();
        //�ո�ĸ���
        for (int i = 0; i < array.length; i++) {
			if(array[i]==' '){
				//���ݵı�������
				char[] array2=null;
				//ÿ����һ�εõ����ַ�����Ҫ��ԭ�����������֮������2���ֶ�  ���������ü�2
				array2=new char[array.length+2];
			    //�ֶ����ݻ���
			    System.arraycopy(array, 0, array2, 0, array.length);
				array2[i]='%';
				array2[i+1]='2';
				array2[i+2]='0';
				//������Ļ�δʶ�����ӵ�����������
				System.arraycopy(array, i+1, array2, i+3, array.length-i-1);
				array=array2;
				i=i+2;
				array2=null;
			}
		}
        result=new String(array);
        return result;
    }
}
