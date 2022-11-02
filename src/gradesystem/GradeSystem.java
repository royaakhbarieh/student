/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradesystem;

import model.Teacher;

/**
 *
 * @author royaa
 */
public class GradeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Christiano1", "Ronaldo1", 10);
        Teacher teacher2 = new Teacher("Christiano2", "Ronaldo2", 20);
        Teacher teacher3 = new Teacher("Christiano3", "Ronaldo3", 30);
        Teacher teacher4 = new Teacher("Christiano4", "Ronaldo4", 40);
        Teacher teacher5 = new Teacher("Christiano5", "Ronaldo5", 50);
        Teacher[] listTeachers = new Teacher[5];
        listTeachers[0] = teacher1;
        listTeachers[1] = teacher2;
        listTeachers[2] = teacher3;
        listTeachers[3] = teacher4;
        listTeachers[4] = teacher5;
//std loop
    //    for (int i = 0; i < listTeachers.length; i++) {
      //      System.out.println("Nom"+ listTeachers[i].getNom());
     //   }
    //enhanced loop
for (Teacher t : listTeachers){
    System.out.println("Nom : "+t.getNom());
    
}    
        
        
    }

}
