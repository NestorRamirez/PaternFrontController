/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import mx.htsoft.front.controller.front.FrontController;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class FrontControllerPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      FrontController frontController = new FrontController();
      frontController.dispatchRequest("HOME");
      frontController.dispatchRequest("Estudiante");
      
    }
    
}
