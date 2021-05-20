package com.qa.javabasics;

public class Strings {

	public static void raining() {
		//	Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
		String rain = "yesterday it was raining";
		String sunny = "today it is sunny";
		
		//	Concatenate both values, capitalize both strings and print out the result.
		rain = rain.toUpperCase();
		sunny =  sunny.toUpperCase();
		System.out.println("\n" + rain + ", " + sunny);
		
		//	The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		//	 Now use the substring method to print out: `TODAY IT IS RAINING`
		String subString1 = sunny.substring(0, 11);
		String subString2 = rain.substring(16, 24);
		System.out.println(subString1 + subString2);
		
	}

	
	
	
//	For this task you are to implement 4 methods that manipulate String objects. 
//	For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. 
//	Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
	
//	Method 1 - When given a String, count and return how many words there are in that String.
//	public static int countWords(String str1) {
//		int count = 0;
//		
//		char ch[] = new char[str1.length()];
//		for(int i = 0; i < str1.length(); i++) {
//			ch[i] = str1.charAt(i);
//			if(((i > 0) && (ch[i] != ' ') && (ch[i-1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
//				count++;
//			}
//		}
//		return count;
//	}
//    public static int countWord(String s) {
//        String s1 = "";
//        int count = 0;
//
//        for(int i = 0; i < s.length(); i++ ) {
//            s1 = s.substring(i, i+1);
//            if(!s1.equals(" "))
//                count++;
//        }
//        return count;
//    }
	public static int countWords(String str1) {
		int words = 0;
		
		for (int x = 0; x < str1.length(); x++) {
			words += str1.substring(x, x+1).equals("\s") ? 1 : 0;
		}
		words += words > 0 ? 1 : 0;
		
		return words;
	}
//	Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
	// Method 2 - When given a String, print out this String in a
    //            vertical fashion, each word on a different line.
//    public static void printVertically(String s) {
//        String currentWord = "";
//        for (int i = 0; i < s.length(); i++) {
//            String currentChar = s.substring(i, i + 1);
//            if (currentChar.equals(" ")) {
//                System.out.println(currentWord);
//                currentWord = "";
//            } else {
//                currentWord += currentChar;
//            }
//        }
//        System.out.println(currentWord);
//    }
	public static void newLine(String str2) {
		System.out.println("\n" + str2.replace(" ", "\n"));
		
	}
//	Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
//	public static void reverseNewLine(String str3) {
//		str3 = str3.replace(" ", "\n");
//		StringBuilder string = new StringBuilder();
//		string.append(str3);
//		System.out.println("\n" + string.reverse());
//		
//	}
	public static void reverseNewLine(String str3) {
		String currentWord = "";
		
		for (int i = str3.length() - 1; i >= 0; i--) {
			String currentChar = str3.substring(i, i + 1);
			
			if(currentChar.equals(" ")) {
				System.out.println("\n" + currentWord);
				currentWord = "";
				
			}else {
				currentWord = currentChar + currentWord;
			}
		}
		System.out.println("\n" + currentWord);
	}
//	Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. 
//	A boolean value should be returned to indicate whether or not the second String has been found in the message.
	public static void findMessage(String message, String strInside) {
		
	}

}
