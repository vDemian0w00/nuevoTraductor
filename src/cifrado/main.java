package cifrado;
import javax.swing.JOptionPane;
import cifrado.Cifrado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class main {
    public static void main(String[] args) {
        
        Cifrado obj = new Cifrado();
        
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "1234567890";
        String frase;
        
        int opc=0, num;
        
        
        
        boolean flag = false;
        do{
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingresa 1 para codificar y 2 para decodificar"));
                if(opc<=0){
                    flag=true;
                    JOptionPane.showMessageDialog(null, "Introduzca numeros validos");
                }
            }catch(Exception e){
                flag=true;
                JOptionPane.showMessageDialog(null, "Introduzca numeros");
            }
        }while(flag);
        
        switch(opc){
            
            case 1:
                frase = JOptionPane.showInputDialog("Ingresa la frase a cifrar");
        
                num=0;

                do{
                    try{
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codex"));
                        if(num<=0){
                            flag=true;
                            JOptionPane.showMessageDialog(null, "Introduzca numeros validos");
                        }
                    }catch(Exception e){
                        flag=true;
                        JOptionPane.showMessageDialog(null, "Introduzca numeros");
                    }
                }while(flag);

                String txt = obj.codificar(letras.concat(numeros), frase, num);

                JOptionPane.showMessageDialog(null, "El texto original: "+frase+"\nTexto Codificado a "+num+" posiciones: "+txt);
            break;
            
            case 2:
                frase = JOptionPane.showInputDialog("Ingresa la frase a descifrar");
        
                num=0;

                do{
                    try{
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el decodex"));
                        if(num<=0){
                            flag=true;
                            JOptionPane.showMessageDialog(null, "Introduzca numeros validos");
                        }
                    }catch(Exception e){
                        flag=true;
                        JOptionPane.showMessageDialog(null, "Introduzca numeros");
                    }
                }while(flag);

                txt = obj.decodificar(letras.concat(numeros), frase, num);

                JOptionPane.showMessageDialog(null, "El texto codificado: "+frase+"\nTexto Decodificado a "+num+" posiciones: "+txt);
            break;
        }
        
        
        
    }
}
