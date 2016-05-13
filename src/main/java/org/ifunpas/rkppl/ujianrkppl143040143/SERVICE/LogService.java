/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujianrkppl143040143.SERVICE;

/**
 *
 * @author SB 604-14
 */
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.ifunpas.rkppl.ujianrkppl143040143.LOGNYA.LogSaya;

public class LogService {
    private static final Logger logger = Logger.getLogger(LogService.class);
    private LogSaya logSaya;
    
    public void setLogService(LogSaya logSaya){
        this.logSaya=logSaya;
    }
    
    
}
