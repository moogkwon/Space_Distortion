package com.space_distortion.model.vo;

//�뿡 ���� �������� 
public class Payment implements PaymentCalable{
	
	private int toTalPrice; // �Ѱ���
	private int drinkPrice; // ���ᰡ��
	private int roomPrice; // �ο���� �氡��
	private double meberDiscount = 0.1; // ȸ���� ���� ���� �ۼ�Ʈ
	private int kindOfAccount; // ���� ��� 1 ī�� 0 ����
	private boolean drinkIsTrue = false; // ���� ��� ����
	private final int TIME_PAY = 1000; // �ð��� ���� õ��
	
	
	@Override
	public void cal() {
		// TODO Auto-generated method stub
		
	} 
	
	
}
