/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemow24tue;

/**
 *
 * @author cunni
 */
public class PartTimeStudent extends Student{
    private int numberOfCourses;

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public PartTimeStudent(int numberOfCourses, int sid, String sname) {
        super(sid, sname);
        this.numberOfCourses = numberOfCourses;
    }
    
}
