/*  Solutions to programming assignments from Michael Collins' (Columbia) NLP class 
	(http://class.coursera.org/nlangp-001). 
    
	Copyright (C) 2013  Martin Wunderlich

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package com.martinwunderlich.nlp.collins.common;


public class Sentence extends AbstractSentence {

	public Sentence() {
		super();		
	}

	public Sentence(String str) {
		super();
		// The string is assumed to be a string with space-separated words. 
		String[] words = str.split(" ");
		
		for(String word : words)
			this.addWord(word);
	}

}