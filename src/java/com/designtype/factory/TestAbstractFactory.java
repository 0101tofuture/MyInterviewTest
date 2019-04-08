package com.designtype.factory;

/**
 * ���󹤳�ģʽ   
 * ���󹤳�������������Ʒ  �������������ģʽ�������������Ĳ�Ʒ 
 * �����������ж����˶�����󷽷�����
 * ʱ��:2019��2��15��
 * @author pefuxc
 *
 */
public class TestAbstractFactory {
	public static void main(String[] args) {
		//������ɫ���� �Ͱ�ɫ����  ���붼Ϊ1��
		AbstractFactory aAbstractFactory=new TestAbstractFactory().new AbstractFactory1();
		AbstractProduct1 aAbstractProduct1=aAbstractFactory.makeAbstractProduct1();
		aAbstractProduct1.make();
		AbstractProduct2 aAbstractProduct2=aAbstractFactory.makeAbstractProduct2();
		aAbstractProduct2.make();
	}
	//��ɫ���� ��С��һ
	private class AbstractProduct1{
		public void make(){
        }
	}
	//��ɫ����
    private class AbstractProduct2{
    	public void make(){
        }
	}
    class Product1 extends AbstractProduct1{
         @Override
		 public void make(){
        	 System.out.println("������ɫ����  ����Ϊ1");
         }
    }
    class Product2 extends AbstractProduct1{
    	 @Override
		 public void make(){
        	 System.out.println("������ɫ����  ����Ϊ2");
         }
    }
	class Product3 extends AbstractProduct2{
		@Override
		public void make(){
       	 System.out.println("������ɫ����  ����Ϊ1");
        }
	}
	class Product4 extends AbstractProduct2{
		@Override
		public void make(){
	       	 System.out.println("������ɫ����  ����Ϊ2");
	    }
	}
	abstract class AbstractFactory{
		abstract AbstractProduct1 makeAbstractProduct1();
		abstract AbstractProduct2 makeAbstractProduct2();
	}
	
	/** ����ɫ���� ���� Ϊ1   ����ɫ���� ����Ϊ1
	 * ʱ��:2019��2��15��
	 * @author pefuxc
	 *
	 */
	class AbstractFactory1 extends AbstractFactory{

		@Override
		AbstractProduct1 makeAbstractProduct1() {
			return new Product1();
		}

		@Override
		AbstractProduct2 makeAbstractProduct2() {
			return new Product3();
		}
		
	}
	
	/**
	 * ����ɫ���� ���� Ϊ2   ����ɫ���� ����Ϊ2
	 * ʱ��:2019��2��15��
	 * @author pefuxc
	 *
	 */
	class AbstractFactory2 extends AbstractFactory{

		@Override
		AbstractProduct1 makeAbstractProduct1() {
			return new Product2();
		}

		@Override
		AbstractProduct2 makeAbstractProduct2() {
			return new Product4();
		}
		
	}
	
}
