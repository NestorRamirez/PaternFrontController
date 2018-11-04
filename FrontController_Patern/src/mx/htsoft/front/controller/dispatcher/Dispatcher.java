/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.htsoft.front.controller.dispatcher;

import mx.htsoft.front.controller.view.EstudianteView;
import mx.htsoft.front.controller.view.HomeView;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class Dispatcher {
    
   private EstudianteView studentView;
   private HomeView homeView;
   
   public Dispatcher(){
      studentView = new EstudianteView();
      homeView = new HomeView();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("Estudiante")){
         studentView.show();
      }
      else{
         homeView.show();
      }	
   }
}
