package edu.estm.electrofleet.model;

public class Batterie {
    private int charge;
    public static final int CHARGE_MAX = 100;

    public Batterie() {
        this(0);
    }

    public Batterie(int chargeInitiale) {
        if (chargeInitiale < 0 || chargeInitiale > CHARGE_MAX) {
            //System.err.println("charge initial invalide"); 
            throw new IllegalArgumentException("charge initial invalide");
        }
        this.charge = chargeInitiale;
    }
    
    public int getCharge() {
        return charge;
    }
    public void recharger(int pointsDeCharge) {
        if (pointsDeCharge < 0) {
            //System.err.println("delta negative");
            throw new IllegalArgumentException("delta negative");
        }
        int capaciteRestante = CHARGE_MAX - this.charge;
        
        if (pointsDeCharge > capaciteRestante){
            //System.err.println("Depassement");
            throw new IllegalArgumentException("Depassement capacite restante");
        }
        this.charge = this.charge + pointsDeCharge;
    }
    public void recharger() {
        int reste = CHARGE_MAX - this.charge;
        if (reste > 0 ){
            this.recharger();
        }
    }
    public void consommer(int pointsDeCharge) {
        if (pointsDeCharge < 0){
            //System.err.println("delta negative");
            throw new IllegalArgumentException("delta negative");
        }
        if(pointsDeCharge > this.charge){
            //System.err.println("consommation superieur a la charge");
            throw new IllegalArgumentException("consommation superieur a la charge");
        }
        this.charge = this.charge - pointsDeCharge;
    }
}
