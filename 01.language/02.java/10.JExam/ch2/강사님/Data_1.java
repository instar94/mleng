package a.b.c.ch2;

// import : 다른 패키지에 있는 자원을 사용할 때 클래스 단위로 불러오는 키워드 이다. 
// import 한 클래스는 해당 클래스 블럭에서 패키지명을 사용하지 않고 클래스 이름으로 사용이 가능한다.
import a.b.c.ch2.data.Data_1_Test;

public class Data_1 {

	public static void main(String[] ar) {

		/*
			다른 패키지에 있는 클래스 자원을 사용하는 방법

			호출 하는 클래스의 자원에 static 키워드가 붙은 경우
				패키지명+클래스명.자원의이름
			호출 하는 클래스의 자원에 static 키워드가 안 붙은 경우
				new 연산자를 이용해서 참조변수로 불러오기 
				클래스 참조변수 = new 클래스();
				참조변수.자원의이름
		*/
		System.out.println(a.b.c.ch2.data.Data_1_Test.TEST_DATA);
		System.out.println(Data_1_Test.TEST_DATA);

		Data_1_Test d2 = new Data_1_Test();
		System.out.println(d2.i);
		d2.a();

		a.b.c.ch2.data.Data_1_Test d1 = new a.b.c.ch2.data.Data_1_Test();
		System.out.println(d1.i);
		//System.out.println(a.b.c.ch2.data.Data_1_Test.i);

		d1.a();

		a.b.c.ch2.data.Data_1_Test.b();
		
	} // end of main 함수 
} // end of Data_1 클래스 


/*
Java Data Type : 자료형

	자바 데이터 타입의 최소 단위는 1byte 이다. 
	1byte 는 8bit 이다 : 00000001

#############################
기초 자료형 : primitive type
#############################

	컴퓨터에서는 숫자의 크고 작음을 사이즈로 하지 않는다 : 정밀도로 한다. 
	실수가 정수보다 무조건 크다.
	예) long 8byte 보다 float 4바이트가 크다고 본다. 

	______________________________________
	
	JVM은 숫자를 int 만 인식한다 : 4byte(32bit)
	______________________________________
	
	int를 넘어가는 데이터 타입은 인식 못한다. 
	long(L , l), float(F , f), double(D, d) 데이터 타입은 표시를 해야 한다. 
		long l = 12987293827L;
		long ll = 12987293827l;
		float f = 23.349384394F;
		float ff = 23.349384394f;
		double d = 243.2337928749D;
		double dd = 243.2337928749d;

	숫자 데이터 타입은 
		사이즈가 작은 데이터 타입에서 큰 테이터 타입으로 대입을 하면 
		자동 형변환이 일어난다. : 묵시적 형변환 : implicit casting 
		큰 데이터 타입에서 사이즈가 작은 데이터 타입으로 대입을 하면
		임의로 형변환을 해 주어야 한다. : 명시적 형변환 : explicit casting
		
		묵시적 형변환 : implicit casting
		---------------------------->
		byte < char < short < int < long < float < double
							<----------------------------
							명시적 형변환 : explicit casting
숫자
	정수 : default 값 : 0
		byte	1byte(8bit) : 음의정수(음의부호 비트) 0 양의정수(양의부호 비트) : -128 ~ 0 ~ +127
			char	2byte(16bit) : 0 을 포함한 양의정수 : 0 ~ +65535
		short	2byte(16bit) : 음의정수(음의부호 비트) 0 양의정수(양의부호 비트)
		int		4byte(32bit) : 음의정수(음의부호 비트) 0 양의정수(양의부호 비트)
		long	8byte(64bit) : 음의정수(음의부호 비트) 0 양의정수(양의부호 비트)

	실수 : default 값 : 0.0 : 지수부.가수부
		float	4byte(32bit) : 음의실수(음의부호 비트) 0 양의실수(양의부호 비트)
		double	8byte(64bit) : 음의실수(음의부호 비트) 0 양의실수(양의부호 비트) 
문자 
	문자 : char 
	문자열 : String : 참조 자료형
	
논리	boolean 1byte(8bit) : default 값 : false
		true, false

#############################
참조 자료형 : reference type 
#############################
	빌트인 클래스
		Array, Interface ...................
	사용자 정의 클래스 
*/

/*
자바는 객체 지향 이며 하이 레벨 랭귀지이다.
Object Oriented Programming

자바에서 사용하는 모든 자원은 Object  이다.
	_____________________________________

	자바에서 사용하는 자원 중 Object 가 아닌 것은
	기초 자료형(primitive type) 이다.

	기초 자료형에 대응하는
	Wrapper Class 의 상수로 존재한다. 
	_____________________________________

byte		Byte
char		Character
short		Short
int			Integer
long		Long
float		Float
double		Double
boolean		Boolean

기초 자료형을 사용하면
자바에서 내부적으로 Wrapper Class 사용한다. 
Byte
Character
Short
Integer
Long
Float
Double
Boolean
*/

