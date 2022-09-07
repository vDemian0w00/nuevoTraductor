package cifrado;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Cifrado {
 
    String txtCodificado="", txtDecodificado="";
    
    public String codificar(String letras, String txt, int codex){
        
        txt=txt.toUpperCase();
        
        char caracter;
        
        for (int i = 0; i < txt.length(); i++) {
            caracter=txt.charAt(i);
            
            int pos = letras.indexOf(caracter);
            
            if(pos==-1){
                txtCodificado+=caracter;
            }else{
                txtCodificado+=letras.charAt((pos+codex)%letras.length());
            }
        }
        System.out.println(txtCodificado);
        return txtCodificado;
    }
    public String decodificar(String letras, String txt, int codex){
        txt=txt.toUpperCase();
        
        char caracter;
        
        for (int i = 0; i < txt.length(); i++) {
            caracter=txt.charAt(i);
            
            int pos = letras.indexOf(caracter);
            
            if(pos==-1){
                txtDecodificado+=caracter;
            }else{
                txtDecodificado+=letras.charAt((pos-codex)%letras.length());
            }
        }
        return txtDecodificado;
    }
    
}
