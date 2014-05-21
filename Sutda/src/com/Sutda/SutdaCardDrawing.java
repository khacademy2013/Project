package com.Sutda;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
public class SutdaCardDrawing extends JPanel
{	private static final long serialVersionUID = -1899443499228085662L;
	Image img = Toolkit.getDefaultToolkit().getImage("src\\images\\Sutda.png"); // 그림읽기
	Image img2 = Toolkit.getDefaultToolkit().getImage("src\\images\\-Sutda.png"); // 그림읽기
	Image bgImg = Toolkit.getDefaultToolkit().getImage("src\\images\\SutdaBG.jpg"); // 그림읽기
	Image hakImg = Toolkit.getDefaultToolkit().getImage("src\\images\\Hak.png"); // 그림읽기
	Image danpungImg = Toolkit.getDefaultToolkit().getImage("src\\images\\Danpung.png"); // 그림읽기
	Image doksuriImg = Toolkit.getDefaultToolkit().getImage("src\\images\\Doksuri.png"); // 그림읽기
	Image loseImg = Toolkit.getDefaultToolkit().getImage("src\\images\\Lose2.png"); // 그림읽기
	Image winImg = Toolkit.getDefaultToolkit().getImage("src\\images\\Win2.png"); // 그림읽기
	Image drawImg = Toolkit.getDefaultToolkit().getImage("src\\images\\Draw2.png"); // 그림읽기
	Image Kwang38 = Toolkit.getDefaultToolkit().getImage("src\\images\\38Kwang.png"); // 그림읽기
	Image Kwang13 = Toolkit.getDefaultToolkit().getImage("src\\images\\13Kwang.png"); // 그림읽기
	Image Kwang18 = Toolkit.getDefaultToolkit().getImage("src\\images\\18Kwang.png"); // 그림읽기
	Image Ggut0Img = Toolkit.getDefaultToolkit().getImage("src\\images\\0Ggut.png"); // 그림읽기
	Image Ggut1Img = Toolkit.getDefaultToolkit().getImage("src\\images\\1Ggut.png"); // 그림읽기
	Image Ggut2Img = Toolkit.getDefaultToolkit().getImage("src\\images\\2Ggut.png"); // 그림읽기
	Image Ggut3Img = Toolkit.getDefaultToolkit().getImage("src\\images\\3Ggut.png"); // 그림읽기
	Image Ggut4Img = Toolkit.getDefaultToolkit().getImage("src\\images\\4Ggut.png"); // 그림읽기
	Image Ggut5Img = Toolkit.getDefaultToolkit().getImage("src\\images\\5Ggut.png"); // 그림읽기
	Image Ggut6Img = Toolkit.getDefaultToolkit().getImage("src\\images\\6Ggut.png"); // 그림읽기
	Image Ggut7Img = Toolkit.getDefaultToolkit().getImage("src\\images\\7Ggut.png"); // 그림읽기
	Image Ggut8Img = Toolkit.getDefaultToolkit().getImage("src\\images\\8Ggut.png"); // 그림읽기
	Image Ggut9Img = Toolkit.getDefaultToolkit().getImage("src\\images\\9Ggut.png"); // 그림읽기
	Image SeryukImg = Toolkit.getDefaultToolkit().getImage("src\\images\\46Seryuk.png"); // 그림읽기
	Image JangsaImg = Toolkit.getDefaultToolkit().getImage("src\\images\\40Jangsa.png"); // 그림읽기
	Image JangbbingImg = Toolkit.getDefaultToolkit().getImage("src\\images\\10JangBbing.png"); // 그림읽기
	Image GubbingImg = Toolkit.getDefaultToolkit().getImage("src\\images\\19GuBbing.png"); // 그림읽기
	Image DoksaImg = Toolkit.getDefaultToolkit().getImage("src\\images\\14Doksa.png"); // 그림읽기
	Image AlriImg = Toolkit.getDefaultToolkit().getImage("src\\images\\12Alri.png"); // 그림읽기
	Image Ddang1Img = Toolkit.getDefaultToolkit().getImage("src\\images\\11Ddang.png"); // 그림읽기
	Image Ddang2Img = Toolkit.getDefaultToolkit().getImage("src\\images\\22Ddang.png"); // 그림읽기
	Image Ddang3Img = Toolkit.getDefaultToolkit().getImage("src\\images\\33Ddang.png"); // 그림읽기
	Image Ddang4Img = Toolkit.getDefaultToolkit().getImage("src\\images\\44Ddang.png"); // 그림읽기
	Image Ddang5Img = Toolkit.getDefaultToolkit().getImage("src\\images\\55Ddang.png"); // 그림읽기
	Image Ddang6Img = Toolkit.getDefaultToolkit().getImage("src\\images\\66Ddang.png"); // 그림읽기
	Image Ddang7Img = Toolkit.getDefaultToolkit().getImage("src\\images\\77Ddang.png"); // 그림읽기
	Image Ddang8Img = Toolkit.getDefaultToolkit().getImage("src\\images\\88Ddang.png"); // 그림읽기
	Image Ddang9Img = Toolkit.getDefaultToolkit().getImage("src\\images\\99Ddang.png"); // 그림읽기
	Image Ddang0Img = Toolkit.getDefaultToolkit().getImage("src\\images\\00Ddang.png"); // 그림읽기
	int findCard; //어느 위치의 그림을 가져올지 정하기 위한 변수 
	int width=1776/8, height=1026/3;
	public SutdaCardDrawing() //생성됨과 동시에 SutdaRule()클래스의 result()메소드를 실행
	{	
	}
	public class FSize extends SutdaWindow //SutdaWindow 클래스의 변수를 상속받기 위해 추상클래스 선언
	{	
	}
	public class ResultImg extends SutdaRule //SutdaRule 클래스의 변수를 상속받기 위해 추상클래스 선언
	{	
	}
	@Override
	public void paint(Graphics g)
	{	int fSizeW = FSize.frame.getWidth(); //SutdaWindow 클래스의 Frame f의 가로값을 담아둘 변수
		int fSizeH = FSize.frame.getHeight(); //SutdaWindow 클래스의 Frame f의 세로값을 담아둘 변수
		g.drawImage(bgImg,0,0,fSizeW,fSizeH,this); //배경이미지를 출력
		g.drawImage(hakImg,fSizeW-219,fSizeH-417,fSizeW-50,fSizeH-50,0,0,169,367,this); //배경이미지를 출력
		g.drawImage(danpungImg,fSizeW-439,0,fSizeW,309,0,0,439,308,this); //배경이미지를 출력
		g.drawImage(doksuriImg,0,0,this); //배경이미지를 출력
		int userCard2to4 = 0; //이미지가 겹치는 것을 방지하는 변수 생성 및 초기화
		int userCard5to7 = 0;
		int userCard8to10 = 0;
		for(int i=1;(i<(SutdaCardList.userSize+SutdaCardList.comSize)*2+1)&&FSize.call==false;i++)
		{	findCard=SutdaCardList.ranNum[i];
			for(int j=0;j<findCard;j++)
			{	if(i<=2) //사용자1의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<1000) //프레임 세로길이가 기형적으로 늘어나면 가로길이를 참조하여 이미지출력
					{ 	g.drawImage(img , fSizeW/2+fSizeW/8*(i-1) , fSizeH/10*7 , fSizeW/8*5+fSizeW/8*(i-1) , fSizeH/10*7+fSizeW/16*3
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);	
					}
					else if(j==findCard-1) //그렇지 않다면 세로길이를 참조하여 이미지출력
					{ 	g.drawImage(img , fSizeW/2+(fSizeH+160)/8*(i-1) , fSizeH/10*7 , fSizeW/2+(fSizeH+160)/8+(fSizeH+160)/8*(i-1) , fSizeH/8*5+(fSizeH+160)/8*2
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);	
					}	
				}
				else if(i>2&&i<=8) //사용자 2부터 4까지의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<1000) 
					{	g.drawImage(img2, fSizeW/10+fSizeW/10*(i-3)+userCard2to4 , fSizeW/30 , fSizeW/10*2+fSizeW/10*(i-3)+userCard2to4 , fSizeW/12*2
							,0,0,222,342,this);	
						if(i%2==0)
							userCard2to4+=fSizeW/10;
					}
					else if(j==findCard-1)
					{	g.drawImage(img2 , fSizeW/10*((i-1)/2)+fSizeH/8*(i-3) , fSizeH/30 , fSizeW/10*((i-1)/2)+fSizeH/8*(i-2) , fSizeH/30*6
							,0,0,222,342,this);	
					}
				}
				else if(i>8&&i<=14) //사용자 5부터 7까지의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<900)
					{	g.drawImage(img2, fSizeW/50+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*6+userCard5to7 , fSizeW/50*6+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*10+userCard5to7
							,0,0,222,342,this);	
						if(i%2==0)
							userCard5to7+=fSizeH/20*4;
					}
					else if(j==findCard-1)
					{	g.drawImage(img2, fSizeW/50+fSizeH/40*(((i-1)%2)*5) , fSizeH/24*6+userCard5to7 , fSizeW/50+fSizeH/40*((((i-9)%2)*5)+5) , fSizeH/24*10+userCard5to7
							,0,0,222,342,this);	
						if(i%2==0)
							userCard5to7+=fSizeH/20*4;
					}
				}
				else if(i>14&&i<=20) //사용자 5부터 7까지의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<900)
					{	g.drawImage(img2, fSizeW/50*39+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*6+userCard8to10 , fSizeW/50*44+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*10+userCard8to10
							,0,0,222,342,this);	
						if(i%2==0)
							userCard8to10+=fSizeH/20*4;
					}
					else if(j==findCard-1)
					{	g.drawImage(img2, fSizeW/50*38+fSizeH/40*(((i-1)%2)*5) , fSizeH/24*6+userCard8to10 , fSizeW/50*38+fSizeH/40*((((i-9)%2)*5)+5) , fSizeH/24*10+userCard8to10
							,0,0,222,342,this);	
						if(i%2==0)
							userCard8to10+=fSizeH/20*4;
					}
				}
			}
		}
		repaint();
		userCard2to4 = 0; //이미지가 겹치는 것을 방지하는 변수 생성 및 초기화
		userCard5to7 = 0;
		userCard8to10 = 0;
		for(int i=1;(i<(SutdaCardList.userSize+SutdaCardList.comSize)*2+1)&&FSize.call==true;i++)
		{	findCard=SutdaCardList.ranNum[i];
			for(int j=0;j<findCard;j++)
			{	if(i<=2) //사용자1의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<1000) //프레임 세로길이가 기형적으로 늘어나면 가로길이를 참조하여 이미지출력
					{ 	g.drawImage(img , fSizeW/2+fSizeW/8*(i-1) , fSizeH/10*7 , fSizeW/8*5+fSizeW/8*(i-1) , fSizeH/10*7+fSizeW/16*3
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);	
					}
					else if(j==findCard-1) //그렇지 않다면 세로길이를 참조하여 이미지출력
					{ 	g.drawImage(img , fSizeW/2+(fSizeH+160)/8*(i-1) , fSizeH/10*7 , fSizeW/2+(fSizeH+160)/8+(fSizeH+160)/8*(i-1) , fSizeH/8*5+(fSizeH+160)/8*2
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);	
					}	
				}
				else if(i>2&&i<=8) //사용자 2부터 4까지의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<1000) 
					{	g.drawImage(img, fSizeW/10+fSizeW/10*(i-3)+userCard2to4 , fSizeW/30 , fSizeW/10*2+fSizeW/10*(i-3)+userCard2to4 , fSizeW/12*2
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);
						if(i%2==0)
							userCard2to4+=fSizeW/10;
					}
					else if(j==findCard-1)
					{	g.drawImage(img , fSizeW/10*((i-1)/2)+fSizeH/8*(i-3) , fSizeH/30 , fSizeW/10*((i-1)/2)+fSizeH/8*(i-2) , fSizeH/30*6
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);
					}
				}
				else if(i>8&&i<=14) //사용자 5부터 7까지의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<900)
					{	g.drawImage(img, fSizeW/50+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*6+userCard5to7 , fSizeW/50*6+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*10+userCard5to7
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);
						if(i%2==0)
							userCard5to7+=fSizeH/20*4;
					}
					else if(j==findCard-1)
					{	g.drawImage(img, fSizeW/50+fSizeH/40*(((i-1)%2)*5) , fSizeH/24*6+userCard5to7 , fSizeW/50+fSizeH/40*((((i-9)%2)*5)+5) , fSizeH/24*10+userCard5to7
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);
						if(i%2==0)
							userCard5to7+=fSizeH/20*4;
					}
				}
				else if(i>14&&i<=20) //사용자 5부터 7까지의 패
				{	if(j==findCard-1&&fSizeH>550&&fSizeW<900)
					{	g.drawImage(img, fSizeW/50*39+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*6+userCard8to10 , fSizeW/50*44+fSizeW/50*(((i-1)%2)*5) , fSizeW/30*10+userCard8to10
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);
						if(i%2==0)
							userCard8to10+=fSizeH/20*4;
					}
					else if(j==findCard-1)
					{	g.drawImage(img, fSizeW/50*38+fSizeH/40*(((i-1)%2)*5) , fSizeH/24*6+userCard8to10 , fSizeW/50*38+fSizeH/40*((((i-9)%2)*5)+5) , fSizeH/24*10+userCard8to10
							,width*(j%8),height*(j/8),width*(j%8+1),height*(j/8+1),this);
						if(i%2==0)
							userCard8to10+=fSizeH/20*4;
					}
				}
			}
		}
		if(ResultImg.result[0]==-1&&FSize.call==true&&fSizeH>550&&fSizeW<900)g.drawImage(loseImg,fSizeW/18*6,fSizeW/22*4,fSizeW/18*11,fSizeW/22*10,0,0,591,591,this);
		else if(ResultImg.result[0]==-1&&FSize.call==true)g.drawImage(loseImg,fSizeW/18*6,fSizeH/22*4,fSizeW/18*11,fSizeH/22*12,0,0,591,591,this);
		if(ResultImg.result[0]==1&&FSize.call==true&&fSizeH>550&&fSizeW<900)g.drawImage(winImg,fSizeW/18*6,fSizeW/22*4,fSizeW/18*11,fSizeW/22*10,0,0,591,591,this);
		else if(ResultImg.result[0]==1&&FSize.call==true)g.drawImage(winImg,fSizeW/18*6,fSizeH/22*4,fSizeW/18*11,fSizeH/22*12,0,0,591,591,this);
		if(ResultImg.result[0]==0&&FSize.call==true&&fSizeH>550&&fSizeW<900)g.drawImage(drawImg,fSizeW/18*6,fSizeW/22*4,fSizeW/18*11,fSizeW/22*10,0,0,591,591,this);
		else if(ResultImg.result[0]==0&&FSize.call==true)g.drawImage(drawImg,fSizeW/18*6,fSizeH/22*4,fSizeW/18*11,fSizeH/22*12,0,0,591,591,this);
		if(ResultImg.zokboRank==1&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Kwang38,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==2&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Kwang13,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==3&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Kwang18,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==13&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang1Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==12&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang2Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==11&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang3Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==10&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang4Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==9&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang5Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==8&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang6Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==7&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang7Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==6&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang8Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==5&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang9Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==4&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(Ddang0Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==14&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(AlriImg,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==15&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(DoksaImg,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==16&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(GubbingImg,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==17&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(JangbbingImg,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==18&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(JangsaImg,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.zokboRank==19&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==true)g.drawImage(SeryukImg,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==0&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false&&FSize.getCallBt==true)g.drawImage(Ggut0Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==1&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut1Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==2&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut2Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==3&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut3Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==4&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut4Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==5&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut5Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==6&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut6Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==7&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut7Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==8&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut8Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		if(ResultImg.playerGgut[0]==9&&FSize.call==false&&SutdaRule.getRank(SutdaRule.playerCard[0]).isZokbo()==false)g.drawImage(Ggut9Img,fSizeW/2-300,fSizeH-300,fSizeW/2,fSizeH-60,0,0,791,591,this);
		repaint();
		FSize.startBt.setBounds(FSize.frame.getWidth()/16*7, FSize.frame.getHeight()/16*9,FSize.frame.getWidth()/16*2,FSize.frame.getHeight()/16);
		if(FSize.getReStartBt==true)FSize.reStartBt.setBounds(FSize.frame.getWidth()/16*7, FSize.frame.getHeight()/16*10,FSize.frame.getWidth()/16*2,FSize.frame.getHeight()/16);
		else if(FSize.getReStartBt==false)FSize.reStartBt.setBounds(0,0,0,0);
		FSize.comSizeUpBt.setBounds(FSize.frame.getWidth()/16*9, FSize.frame.getHeight()/16*9,FSize.frame.getWidth()/16*2,FSize.frame.getHeight()/16);
		FSize.comSizeDownBt.setBounds(FSize.frame.getWidth()/16*5, FSize.frame.getHeight()/16*9,FSize.frame.getWidth()/16*2,FSize.frame.getHeight()/16);
		if(FSize.getCallBt!=true)FSize.callBt.setBounds(0,0,0,0);
		else if(FSize.getCallBt!=false)FSize.callBt.setBounds(FSize.frame.getWidth()/30*27, FSize.frame.getHeight()/30*27,FSize.frame.getWidth()/30*3,FSize.frame.getHeight()/30*3);
		FSize.startPn.setBounds(FSize.frame.getWidth()/16*5, FSize.frame.getHeight()/16*6,FSize.frame.getWidth()/16*6,FSize.frame.getHeight()/16*4);
		if(FSize.getCallBt!=true)FSize.uMoney.setBounds(0,0,0,0);
		else if(FSize.getCallBt!=false)FSize.uMoney.setBounds(FSize.frame.getWidth()/2-130, FSize.frame.getHeight()-50,120,30);
		FSize.uMoney.setText(ResultImg.userMoney+" ");
		repaint();
		//if(fSizeH<750)FSize.frame.setSize(fSizeW, 750); //프레임세로가 750보다 작아지면 750으로 바꾼다.
		//else if(fSizeW<900)FSize.frame.setSize(900, fSizeH); //프레임가로가 900보다 작아지면 900으로 바꾼다.
	}
    @Override
    public void update(Graphics g) 
    { 	paint(g);
    }
}
