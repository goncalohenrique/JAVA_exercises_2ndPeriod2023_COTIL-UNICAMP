/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author aluno
 */
public class AlturaVaziaException extends RuntimeException{   
    @Override
    public String getMessage()
    {
        return("O campo altura deve ser um número positivo");
    }
    
}
