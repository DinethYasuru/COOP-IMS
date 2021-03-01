/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serial;

import jssc.SerialPort;

/**
 *
 * @author Dineth
 */
public class Serial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int barcode=0;
       SerialPort sp=new SerialPort("COM4");
        try {
            sp.openPort();
            sp.setParams(9600, 8,1, 0);
            if(!sp.isOpened())
                System.out.println("not opened");
            byte[] key=new byte[100];
            key=sp.readBytes();
            System.out.println(key);
            System.out.println(sp.getPortName());
        } catch (Exception e) {
        }
           
    }
    
}
