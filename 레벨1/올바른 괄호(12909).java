class Solution {

/*
올바른 괄호

문제 설명
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 
반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 
예를 들어
"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 
문자열 s가 올바른 괄호이면 true를 return 하고, 
올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

입출력 예
   s       answer
"()()"	    true
"(())()"    true
")()("	    false
"(()("	    false
*/

 /*   boolean solution(String s) {

        boolean answer = true;
           int c1=0;
           String[] Arr = s.split("");
            for(String ss : Arr){
                if(ss.equals("(")){
                 c1++; 
                }else{
                 c1--; } 
                
                if(c1<0){
                answer=false;   
                }
            
            }
            if(c1!=0){
                answer=false;
            }
        
        return answer;
    }
*/

// 이렇게 풀었더니 시간초과로 실패함..


// 다시 품

    boolean solution(String s) {
        
        boolean answer = true;
        int c1=0;
        for(int i=0; i<s.length();i++){
            
            if(s.charAt(i)=='('){
                c1++;
            }else{ c1--; }
            
            if(c1<0){
                answer = false;
            }   
        }
        
        if(c1!=0){
            answer=false;
        }
        
        return answer;
    }

// 이렇게 하니까 통과됨. 
// split해서 배열에 담은뒤 for문 돌리는게 시간이 많이 걸리나봄..


}