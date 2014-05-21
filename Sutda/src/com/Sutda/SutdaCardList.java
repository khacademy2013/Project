package com.Sutda;
import java.util.Random;
import java.util.Vector;

public class SutdaCardList
{	static int userMoney;
	static int userSize = 1;
	static int comSize  = 9;
	static String cardStr [] = new String[21]; //1부터 20까지의 카드String을 담아두는 배열, 편의상 21개 생성
	static String playerCard[] = new String[userSize+comSize]; //사용자의 패를 담아둘 배열
	static int playerGgut[] = new int[userSize+comSize]; //사용자 카드의 끗값을 구해서 담아둘 배열
	static int ranNum[] = new int[21];
	public SutdaCardList() //1~20까지의 숫자를 "01~20"까지의 문자로 담기 위한 생성자(0은 사용하지 않습니다.)
	{	
	}
	public SutdaCardList getCard() //랜덤으로 카드String을 뽑고 두장씩 합치기 위한 getCard()메소드
	{	System.out.println();
		for(int i = 0;i<cardStr.length;i++)
		{	if(i==0)i++;
			if(i<10&&i!=0){cardStr[i] = "0"+i;}
			else {cardStr[i] = ""+i;}
		}
		Vector<Integer> cardBox = new Vector<Integer>(); //중복을 피하기 위해 Vector 배열을 사용
		for(int i=1;i<21;i++)
		{	cardBox.add(i);
		}
		Random ran = new Random();
		for(int i=1;i<21;i++)
		{	ranNum[i] = cardBox.remove(ran.nextInt(cardBox.size())).intValue();
			System.out.print(ranNum[i]+"    ");
		}   
		System.out.println();
		int j = 0;
		for(int i=1;i<21;i++) //두장씩 합쳐서 끗값 오름차순으로 playerCard[] 배열에 넣는다. EX : "1102"
		{	if(j<(userSize+comSize))
			{	int k=cardStr[ranNum[i]].charAt(0)-'0', k2=cardStr[ranNum[i]].charAt(1)-'0';
				int l =cardStr[ranNum[i+1]].charAt(0)-'0', l2=cardStr[ranNum[i+1]].charAt(1)-'0';
				if((k2+l2)<10)playerGgut[j]=k2+l2;
				else playerGgut[j]=k2+l2-10;
				if(k2!=0&&l2==0) playerCard[j]= cardStr[ranNum[i]]+cardStr[ranNum[i+1]];
				else if(k2==0&&l2==0&&k==1) playerCard[j]= cardStr[ranNum[i]]+cardStr[ranNum[i+1]];
				else if(k2==0&&l2==0&&k==2) playerCard[j]= cardStr[ranNum[i+1]]+cardStr[ranNum[i]];
				else if(k2<l2&&k2!=0) playerCard[j]= cardStr[ranNum[i]]+cardStr[ranNum[i+1]];
				else if(k2>l2&&k2!=0) playerCard[j]= cardStr[ranNum[i+1]]+cardStr[ranNum[i]];
				else if(k2==l2&&k==0) playerCard[j]= cardStr[ranNum[i]]+cardStr[ranNum[i+1]];
				else playerCard[j]= cardStr[ranNum[i+1]]+cardStr[ranNum[i]];
				i++;
				j++;
			}
		}
		for(int i=0;i<userSize+comSize;i++)                       	    //플레이어카드체크
		System.out.print(playerCard[i]+"//");	 		//플레이어카드체크
		System.out.println();								 		//플레이어카드체크
		j=0;
		for(int i=0;i<userSize+comSize;i++)								 //플레이어끗체크
		{System.out.print(playerGgut[i]+"///////");}   //플레이어끗체크
		System.out.println();                                       //플레이어끗체크
		return null;         
	}
	public static void main(String[] args) 
	{	new SutdaCardList().getCard();
	}
}
