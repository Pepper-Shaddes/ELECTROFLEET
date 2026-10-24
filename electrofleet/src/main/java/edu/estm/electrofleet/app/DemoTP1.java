package edu.estm.electrofleet.app;

import edu.estm.electrofleet.model.Batterie;
import edu.estm.electrofleet.model.Position;

public class DemoTP1 {

    public static void agir(Batterie b){
        b.recharger(10);
        b = new Batterie(5);
        b.recharger(5);

    }
    public static void main(String[] args){

        Batterie a = new Batterie(40);
        a.recharger(15);
        System.out.println(a.getCharge());
        a.consommer(20);
        System.out.println(a.getCharge());
        Batterie alias = a;
        alias.recharger(5);
        System.out.println(a.getCharge());

        agir(a);
        System.out.println(a.getCharge());
        System.out.println(a  == alias);

        Position p1 = new Position(19, 29);
        Position p2 = new Position(19, 29);
        System.out.println(p1  == p2);
        System.out.println(p1.getX() == p2.getX() && p1.getY() == p2.getY());
    }
}


