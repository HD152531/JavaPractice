/**
 * 
 */
package org.dimigo.basic;

/**
 *<pre>
 * org.dimigo.basic
 * 	 |_PrimitiveDataType
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14. 
 * </pre>
 * 
 * @author : 이준구
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
		      // TODO Auto-generated method stub

		   System.out.println("<<아이유 프로필>>");
		   String name = "아이유";
		   System.out.println("이름 : " + name);
		   boolean isMale = false;
		   if(isMale){
		      System.out.println("성별 : 남자");
		   }
		   else{
		      System.out.println("성별 : 여자");
		   }
		   
		   int age = 25;
		   System.out.println("나이 : " + age + "세");
		   
		   double height = 161.8;
		   System.out.println("키 : " + height + "cm");
		   
		   float weight = 44.3f;
		   System.out.println("몸무게 : " + weight + "kg");
		   
		   char bloodType = 'A';
		   System.out.println("혈액형 : " + bloodType + "형");
		   }
	

	}


