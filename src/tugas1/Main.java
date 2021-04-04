/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args){
        Kubus kubus = new Kubus(4);
        Tabung tabung = new Tabung(10,7);
        kubus.tampilkan();
        tabung.tampilkan();
    }
}
