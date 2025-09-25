import java.util.ArrayList;
import java.util.List;

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
 letters += word;

    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
         if (letters.length() == 0) {
            return '\0'; // return empty char if no letters
        }
        int index = (int)(Math.random() * letters.length());
        return letters.charAt(index);
    
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
       int mid = letters.length() / 2;
        return letters.substring(0, mid) + company + letters.substring(mid);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
      String vowels = "aeiouAEIou";
      for (int i = 0; i< letters.length(); i++){
       if(vowels.indexOf(letters.charAt(i)) != -1){
       letters = letters.substring(0,i) + letters.substring(i+1);
        return;
       }

      }  
    
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
if (letters.length() == 0) return;
        if (num >= letters.length()) {
            letters = "";
            return;
        }
        int start = (int)(Math.random() * (letters.length() - num + 1));
        letters = letters.substring(0, start) + letters.substring(start + num);
    }
    

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
         int index = letters.indexOf(word);
        if (index != -1) {
            letters = letters.substring(0, index) + letters.substring(index + word.length());
        }
    }

}


