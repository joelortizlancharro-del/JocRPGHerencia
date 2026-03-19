public class Orc extends PersonatgeHerencia{

    public Orc(String name, int age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, ArmaHerencia actualWeapon, double health, double mana){
        super(name, age, strength, dexterity, constitution, intelligence, wisdom, charisma, actualWeapon, health, mana);
        setStatsOrc(strength, constitution);
    }

    public void setStatsOrc(int strength, int constitution){
        if(this.strength > 17){
            for(int i = this.strength; i < 20; i++){
                this.strength += 1;
            }
        }
        else{
            this.strength += 3;
        }

        if(this.constitution == 20){
            this.constitution = 20;
        }
        else{
            this.constitution += 1;
        }
    }

    @Override
        public double atac(){
        double damageDealth;
          damageDealth = (this.strength * (1 + actualWeapon.getDamage() / 100)) * 1.1;
          System.out.println(this.strength + "  " + actualWeapon.getDamage());
        return damageDealth;
    }
}