import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int [][]m = new int[3][3];
    System.out.println("inserisci i valori della matrice");
    for(int i =0;i<3;i++){
      for(int j=0;j<3;j++){
        m[i][j] = in.nextInt();
      }
    }
    boolean isSimmetric = isSimmetrica(m);
    if (isSimmetric)
      System.out.println("la matrice è simmetrica");
    else
      System.out.println("la matrice non è simmetrica");
  }
  private static boolean isSimmetrica(int [][]m){
    boolean isSim = true;
    for(int i =0;i<3;i++){
      for(int j=0;j<3;j++){
        if(m[i][j]!=m[j][i]){
          isSim = false;
        }
      }
    }
    return isSim;
  }
}