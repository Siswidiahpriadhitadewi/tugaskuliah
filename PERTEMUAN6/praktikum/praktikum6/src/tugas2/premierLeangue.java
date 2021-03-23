/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author LENOVO IDP 110
 */
public class premierLeangue {
     String team;
    int play, goal, points;

   
    public premierLeangue(String t, int p, int g, int pt){
        team=t;
        play=p;
        goal=g;
        points=pt;
        
    }
      void tampil(){
        System.out.println("Team : "+team);
        System.out.println("play : " +play);
        System.out.println("goals : " +goal);
        System.out.println("points : "+points);
    }
  
}
