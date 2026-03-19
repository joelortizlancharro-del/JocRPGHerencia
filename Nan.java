public class Nan extends PersonatgeHerencia{

    public Nan(String name, int age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, ArmaHerencia actualWeapon, double health, double mana){
        super(name, age, strength, dexterity, constitution, intelligence, wisdom, charisma, actualWeapon, health, mana);
        setStatsNan(constitution, dexterity);

        weapons.add(new ArmaHerencia("Excalibur", true, 50, "Sword"));     
        weapons.add(new ArmaHerencia("Iron Sword", false, 28, "Sword"));   
        weapons.add(new ArmaHerencia("Dragon Slayer", true, 50, "Sword")); 

        weapons.add(new ArmaHerencia("Hunter Bow", false, 80, "Bow"));      
        weapons.add(new ArmaHerencia("GodSlayer", true, 46, "Bow"));       
        weapons.add(new ArmaHerencia("Elven Bow", true, 44, "Bow"));      

        weapons.add(new ArmaHerencia("Apprentice Staff", false, 26, "Staff")); 
        weapons.add(new ArmaHerencia("Arcane Staff", true, 45, "Staff"));      
        weapons.add(new ArmaHerencia("Ancient Staff", true, 52, "Staff"));     

        weapons.add(new ArmaHerencia("Woodcutter Axe", false, 32, "Axe"));     
        weapons.add(new ArmaHerencia("Battle Axe", false, 35, "Axe"));        
        weapons.add(new ArmaHerencia("Doom Axe", true, 48, "Axe"));  
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