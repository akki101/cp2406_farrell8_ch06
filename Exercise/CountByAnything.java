import javax.swing.*;

public class CountByAnything{
    public static void main(String[] args) {
        int i,num, j;
        num = Integer.parseInt(JOptionPane.showInputDialog("enter the number to count by. "));
        for (i = 3, j = 1; i<=300; i+=num, ++j){
            System.out.print(i+" ");
            if (j == 10){
                System.out.println();
                j = 0;
            }

        }
    }
}
