/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujianrkppl143040143.LOGNYA;

/**
 *
 * @author SB 604-14
 */
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
public class LogSaya {
    
    private static final Logger logger = Logger.getLogger(LogSaya.class);
    
    public void debug(){
        logger.log(Level.DEBUG, "Ini adalah debug message");
    }
    
    
    
}
