public class Nan extends PersonatgeHerencia{

    public Nan(String name, int age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, ArmaHerencia actualWeapon, double health, double mana){
        super(name, age, strength, dexterity, constitution, intelligence, wisdom, charisma, actualWeapon, health, mana);
        setStatsNan(constitution, dexterity);
    }

    public void setStatsNan(int constitution, int dexterity){
        if(this.constitution > 16){
            for(int l = this.constitution; l < 20; l++){
                this.constitution += 1;
            }
        }
        else{
            this.constitution += 4;
        }

        if(this.dexterity == 5){
            this.dexterity = this.dexterity;
        }
        else{
            this.dexterity -= 1;
        }
    }

    @Override
    public void regenHealth(){
        this.health += this.constitution*4;
    }

    @Override
    public double defendDamage(double damageReceived){
         damageReceived = (damageReceived /2) * 0.75;
        return damageReceived;
    }
}