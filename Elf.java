public class Elf extends PersonatgeHerencia{

    public Elf(String name, int age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, ArmaHerencia actualWeapon, double health, double mana){
        super(name, age, strength, dexterity, constitution, intelligence, wisdom, charisma, actualWeapon, health, mana);
        setStatsElf(dexterity, intelligence);
    }

    public void setStatsElf(int dexterity, int intelligence){
        if(this.dexterity > 18){
            for(int j = this.dexterity; j < 20; j++){
                this.dexterity += 1;
            }
        }
        else{
            this.dexterity += 2;
        }

        if(this.intelligence > 18){
            for(int x = this.intelligence; x < 20; x++){
                this.intelligence += 1;
            }
        }
        else{
            this.intelligence += 2;
        }
    }

    @Override
    public void regenMana(){
        this.mana += this.intelligence*3;
    }
    
}