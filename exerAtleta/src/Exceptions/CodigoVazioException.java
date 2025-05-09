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
public class CodigoVazioException extends RuntimeException{   
    @Override
    public String getMessage()
    {
        return("O campo código deve ser um número positivo");
    }
    
}
