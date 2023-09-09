package TragaMonedas;
import javax.swing.JLabel;

public class Iniciar{
    private JLabel L[]=new JLabel[3];
    private String fotos[]=new String[3];
    public Iniciar(JLabel l1,JLabel l2,JLabel l3){
        L[0]=l1;
        L[1]=l2;
        L[2]=l3;
        fotos[0]="/TragaMonedas/Pica.png";
        fotos[1]="/TragaMonedas/Trebol.png";
        fotos[2]="/TragaMonedas/Cereza.png";
    }
    
    void asignar(){
        for(int i=0;i<3;i++){
            int pos=(int)(Math.random()*3);
            L[i].setIcon(new javax.swing.ImageIcon(getClass().getResource(fotos[pos])));
        }
    }
}