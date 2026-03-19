public class Huma extends PersonatgeHerencia{

    public Huma(String name, int age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, ArmaHerencia actualWeapon, double health, double mana){
        super(name, age, strength, dexterity, constitution, intelligence, wisdom, charisma, actualWeapon, health, mana);
        setStatsHuma(strength, dexterity, constitution, intelligence, wisdom, charisma, health, mana);
    }

    public void setStatsHuma(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, double health, double mana){
        if(super.getStrength() == 20){
            super.setStrength(strength);
        }
        else{
            super.setStrength(strength + 1);
        }
       
        if(super.getDexterity() == 20){
            super.setDexterity(dexterity);
        }
        else{
            super.setDexterity(dexterity + 1);
        }
        
        if(super.getConstitution() == 20){
            super.setConstitution(constitution);
            super.setHealt(constitution);
        }
        else{
            super.setConstitution(constitution + 1);
            super.setHealt(constitution + 1);
        }

        if(super.getIntelligence() == 20){
            super.setIntelligence(intelligence);
            super.setMana(intelligence);
        }
        else{
            super.setIntelligence(intelligence + 1);
            super.setMana(intelligence + 1);
        }

        if(super.getWisdom() == 20){
            super.setWisdom(wisdom);
        }
        else{
            super.setWisdom(wisdom + 1);
        }

        if(super.getCharisma() == 20){
            super.setCharisma(charisma);
        }
        else{
            super.setCharisma(charisma + 1);
        }
    }
    
}