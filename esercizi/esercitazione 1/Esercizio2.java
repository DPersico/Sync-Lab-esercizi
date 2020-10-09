import java.util.Scanner;
public class Esercizio2 {

public static boolean palindroma(String stringa) {

  boolean palindroma = true;

  if(stringa.length() < 2){
    return palindroma;
  }

  if(stringa.length() % 2 != 0){
    for(int i = 0; i < (stringa.length() / 2); i++){
      if(stringa.charAt(i) != stringa.charAt(stringa.length() - 1 - i)){
        palindroma = false; }
    }
  }else if(stringa.length() % 2 == 0){
    for(int i = 0; i <= (stringa.length() / 2); i++){
      if(stringa.charAt(i) != stringa.charAt(stringa.length() - 1 - i)){
        palindroma = false;
      }
    }
  }

  return palindroma;

}
public static void main(String[] args) {

  Scanner tastiera = new Scanner(System.in);

  System.out.println("Inserisci una stringa: ");
  String stringa = tastiera.nextLine();

  System.out.println(palindroma(stringa));

}

}
