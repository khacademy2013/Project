package com.Sutda;

public class SutdaRule extends SutdaCardList
{	static String zokbo[] = {"0308","0103","0108" /*광땡*/
		,"1020","0919","0818","0717","0616","0515","0414","0313","0212","0111" /*땡*/
		,"0102","0112","1102","1112" /*알리*/
		,"0104","0114","1104","1114" /*독사*/
		,"0109","0119","1109","1119" /*구삥*/
		,"0110","0120","1110","1120" /*장삥*/
		,"0410","0420","1410","1420" /*장사*/
		,"0406","0416","1406","1416" /*세륙*/};
	private static boolean isZokbo;
	static int zokboRank;
	static int result[] = new int[userSize+comSize];
	public static SutdaRule getRank(String playerCard) //zokbo[]배열을 참조하여 playerCard를 받아 zokboRank를 메겨준다.
	{	setZokbo(false);
		for(int i=0;i<zokbo.length;i++)
		{	if(zokbo[i].equals(playerCard))
			{	setZokbo(true);
				switch (i+1) 
				{	case 1: zokboRank=1;	break; //삼팔광땡
					case 2: zokboRank=2;	break; //일삼광땡
					case 3: zokboRank=3;	break; //일팔광땡
					case 4: zokboRank=4; 	break; //장땡
					case 5: zokboRank=5; 	break; //구땡
					case 6: zokboRank=6; 	break; //팔땡
					case 7: zokboRank=7; 	break; //칠땡
					case 8: zokboRank=8; 	break; //육땡
					case 9: zokboRank=9; 	break; //오땡
					case 10: zokboRank=10; break; //사땡
					case 11: zokboRank=11; break; //삼땡
					case 12: zokboRank=12; break; //이땡
					case 13 :zokboRank=13; break; //일땡
					case 14: case 15: case 16: case 17: //알리
					zokboRank=14; 	break;	//알리
					case 18: case 19: case 20: case 21: //독사
					zokboRank=15;    break; //독사
					case 22: case 23: case 24: case 25: //구삥
					zokboRank=16;    break; //구삥
					case 26: case 27: case 28: case 29: //장삥
					zokboRank=17;    break; //장삥
					case 30: case 31: case 32: case 33: //장사
					zokboRank=18; 	break; //장사
					case 34: case 35: case 36: case 37: //세륙
					zokboRank=19;  break; //세륙
				default: zokboRank=0;
					break;
				}
			}
		}
		return null;
	}
	public SutdaRule() //기본생성자:getCard()메소드를 실행하는 SutdaCardList 클래스 생성
	{	
	}
	@SuppressWarnings("static-access") //에러제거
	public void result() 
	{ 	for(int i=0;i<(userSize+comSize);i++) //족보랭크 출력테스트
		{	zokboRank=0;
			System.out.print("////"+getRank(playerCard[i]).zokboRank+"///");
		}
		System.out.println();
		for(int i=0;i<(userSize+comSize);i++) //자신을 제외한 모든패와 싸워서 이기면 +1 지면 -1 하여 결과를 result[] 배열에 넣는다.
		{	result[i]=0;
			for(int j=0;j<(userSize+comSize);j++)
			{	if(i!=j)
				{	if(getRank(playerCard[i]).isZokbo()==true&&getRank(playerCard[j]).isZokbo()==true)
					{	if(getRank(playerCard[i]).zokboRank<getRank(playerCard[j]).zokboRank) result[i]+= 1;
						else if(getRank(playerCard[i]).zokboRank>getRank(playerCard[j]).zokboRank) result[i] += -1;
						else result[i] += 0;
					}
					else if(getRank(playerCard[i]).isZokbo()==true&&getRank(playerCard[j]).isZokbo()==false)
					{	result[i] += 1;
					}
					else if(getRank(playerCard[i]).isZokbo()==false&&getRank(playerCard[j]).isZokbo()==true)
					{	result[i] += -1;
					}
					else if(getRank(playerCard[i]).isZokbo()==false&&getRank(playerCard[j]).isZokbo()==false)
					{	if(SutdaCardList.playerGgut[i]>SutdaCardList.playerGgut[j]) result[i] += 1;
						else if(SutdaCardList.playerGgut[i]<SutdaCardList.playerGgut[j]) result[i] += -1;
						else result[i] = 0;	
					}
				}
				else continue;
			}
			System.out.print(result[i]+"@@@");
		}
		System.out.println();
		for(int i=0;i<result.length;i++)
		{	for(int j=0;j<result.length;j++)
			{	if(i!=j&&result[i]>result[j]){result[j]=-1;}
				else	if(i!=j&&result[i]<result[j]){result[i]=-1;}
			}
		}
		int count = 0;
		for(int i=0;i<result.length;i++)
		{	if(result[i]!=-1){result[i]=1;count++;}
			System.out.print(result[i]+"^^^^^");
		}
		System.out.println();
		for(int i=0;i<result.length;i++)
		{	if(count>1&&result[i]==1)result[i]=0;
			System.out.print(result[i]+"^^^^^");
		}
	}

	public static boolean isZokbo() //겟터
	{	return isZokbo;
	}
	public static void setZokbo(boolean isZokbo) //셋터
	{	SutdaRule.isZokbo = isZokbo;
	}
	public static void main(String[] args) {
		new SutdaCardList().getCard();
		new SutdaRule().result();
	}
}



