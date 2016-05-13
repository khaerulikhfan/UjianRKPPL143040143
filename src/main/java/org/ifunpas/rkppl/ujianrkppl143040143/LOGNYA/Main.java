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

import org.ifunpas.rkppl.ujianrkppl143040143.SERVICE.LogService;
public class Main {
    
    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args){
        logger.info("Ini adalah info message : Contoh Log4J");
        LogSaya log = new LogSaya();
   
        LogService service = new LogService();
        logger.info("Ini adalah info message : Contoh Log4J");
        service.setLogService(log);
    }
    
}
