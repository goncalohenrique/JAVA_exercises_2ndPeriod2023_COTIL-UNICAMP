/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author aluno
 */
public class StringVaziaException extends RuntimeException {
    @Override
    public String getMessage()
    {
        return("O campo não pode ser vazio");
    }
    
}
