package ch03_제어문;

public class Break와Continue {
	
	public static void main(String[] args) {
		
		/**
		 * @break 문은 앞서 switch문을 빠져나가는 용도로 다루었었는데, 
		 * 마찬가지로 반복문을 빠져나가는 용도로도 사용된다. 
		 * 보통 if문과 함께 사용되어 특정 조건이 만족될 때, 이를 감싸는 반복문을 빠져나가도록 구성이 된다. 
		 * break는 이전에 다루던 것과 별 차이가 없기 때문에 따로 예제를 다루지 않는다.
		 */
		
		/**
		 * @continue문은 break문과 혼동하기 쉬워서 주의가 필요하다.
		 * 우선 continue는 반복문의 탈출과 거리가 멀다. 
		 * 실행하던 반복문의 나머지 부분을 생략하고 프로그램의 흐름을 조건 검사 부분으로 이동시킨다. 
		 * 일단 예제를 보자.
		 */
		
		
		int n = 0;
		
		while((n++)<5) {//while 하단부에서 증가시켜줬던 구문을 이런식으로 작성할 수 있다.
			
			if(n == 1)
				continue;
			
			System.out.println("I Like Java");
		}
		/**
		 * 위의 구문을 실행시켜보면 
		 * 총 4번 실행 되는 것을 알 수 있다.
		 * 0~4까지 총 5번 출력되는 것이 맞는 것 이라고 생각 할 수 있는데, 
		 * 이유는 조건에 따른 continue 구문이 실행하게 되면 그 이후의 문장은 무시하고
		 * 다시 반복문의 조건 검사로 이동하게 된다.
		 */
	}

}
