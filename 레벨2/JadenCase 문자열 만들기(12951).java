class Solution {
    public String solution(String s) {

//    	문제 설명
//    	JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
//    	단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
//    	문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
//
//    	제한 조건
//    	s는 길이 1 이상 200 이하인 문자열입니다.
//    	s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
//    	숫자는 단어의 첫 문자로만 나옵니다.
//    	숫자로만 이루어진 단어는 없습니다.
//    	공백문자가 연속해서 나올 수 있습니다.
//    	
//    	입출력 예
//    	"3people unFollowed me"	"3people Unfollowed Me"
//    	"for the last week"	"For The Last Week"

//      String answer = "";
        
//      String [] Arr =s.split(" ");
        
//      for(String a : Arr){
//          String up = a.substring(0,1).toUpperCase();
//          String ex = a.substring(1).toLowerCase();
//          answer += (up+ex+" "); // 단어 뒤에 공백만들기
//      }
        
//      answer = answer.substring(0,answer.length()-1); // 맨뒤 공백 없애기
        
//      return answer;

// 공백이 여러개 나올 수 있기 때문에 오답이라고 함..



// 새로운 풀이

        String answer = "";

        String a = s.substring(0,1).toUpperCase(); // 첫번째 글자 대문자로
        String b = s.substring(1).toLowerCase(); // 나머지 소문자로
        String c = a+b; // 합치기
        String [] Arr = c.split(""); // 한글자씩 나눠서 배열담기
        
        boolean bb = false;
        for(String ss : Arr){
            if(bb){ // 이전 글자가 공백이면 대문자로
                ss=ss.toUpperCase();
            }
            bb=false; // false로 초기화           
	    if(ss.equals(" ")){ // 공백이면 트루담기
                bb = true;   
            }
            answer += ss; // 글자 합치기
        }
           return answer;
       
        
}
}