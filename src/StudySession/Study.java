package StudySession;

import PracticeGeneral.Array;
import sun.font.FontRunIterator;

import java.util.Arrays;

public class Study {

    public static void main(String[] args) {

        String [] initials={ "GT","LA","O","EG","ACP","G"};

      for (String name: initials){
          System.out.println(name);
      }
        System.out.println(Arrays.toString(initials));
        System.out.println("**************************************");

        String sentence="Hello world java is here";
        String [] word=sentence.split( "");

        for (String words:word){
            System.out.println(words);

        }

    }
}
