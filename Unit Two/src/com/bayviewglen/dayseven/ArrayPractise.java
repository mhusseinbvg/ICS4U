package com.bayviewglen.dayseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) throws FileNotFoundException {
		String[] allWords = new String[1000];
		int wordCount = 0;

		Scanner input = new Scanner(new File("input/words.dat"));
		while (input.hasNext()) {
		    String word = input.next();
		    allWords[wordCount] = word;
		    wordCount++;
		}

		String[] newArray = new String[wordCount];
		
		for (int i=0; i<wordCount; ++i){
			newArray[i] = allWords[i];
		}
		
		Arrays.sort(newArray);
		
		for (int i=wordCount-1; i>=0; --i){
			System.out.println(newArray[i]);
		}
		
		for (int j=wordCount/2; j<wordCount-1; ++j){
			newArray[j] = newArray[j+1];
		}
		
		System.out.println("*******************");
		
		allWords = new String[wordCount-1];
		
		for (int i=0; i<wordCount-1; ++i){
			allWords[i] = newArray[i];
		}
		
		for (int i=allWords.length-1; i>=0; --i){
			System.out.println(allWords[i]);
		}

	}

}
