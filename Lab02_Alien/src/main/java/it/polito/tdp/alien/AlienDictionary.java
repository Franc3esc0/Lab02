package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.TreeMap;

public class AlienDictionary {
	
	LinkedList<Word> words;
	TreeMap<String, Word> wordsTree;
	
	public AlienDictionary() {
		
		words = new LinkedList<Word>();	
		wordsTree = new TreeMap<String, Word>();
	}
	
	
	public void addWord(String alienWord, String translation) {
	
		Word w = wordsTree.get(alienWord);
		if(w == null) {
			
			w = new Word(alienWord, translation);
			wordsTree.put(alienWord, w);
			words.add(w);
		}
		else {
			
			w.setTranslation(translation);	
		}
	}
	
	
	public String translateWord(String alienWord) {
		return wordsTree.get(alienWord).getTranslation();	
	}
	

}
