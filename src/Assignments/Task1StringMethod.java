package Assignments;

public class Task1StringMethod {

    //Task 1 : SessionString Methods
//Sentence =hello my name is hello worlD.   i am 25 years old. i am living in new yorK .
// i have been in the IT industry for about 6 years.  i starteD as a manUal tesTer and now doing AutOMation for about 4 years.
// i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates. my main lanGuage is JAVA.
// i designed and deveLoped many automation test scripts by using BDD framework
//first create one string and copy pass above paragraf.
//then create multiple strings to store each sentence that you see in the paragraf.
//Do below modification for your sentences :
//make sure each sentence first letter capital .
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences
//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.
//
    public static void main(String[] args) {

  String sentence1= "hello my name is Suleyman.   i am 24 years old. i am living in Virginia .";
  String sentence2= "i have been in the IT industry for about 2 months.  i starteD as a manUal tesTer and now doing AutOMation for about 4 years.";
  String  sentence3="i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates. my main lanGuage is JAVA.";
  String sentence4="i designed and deveLoped many automation test scripts by using BDD framework";


        System.out.println(sentence1.substring(0,1).toUpperCase().concat(sentence1.substring(1).trim()));

    }


}
