public class Elf extends PersonatgeHerencia{

    public Elf(String name, int age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, ArmaHerencia actualWeapon, double health, double mana){
        super(name, age, strength, dexterity, constitution, intelligence, wisdom, charisma, actualWeapon, health, mana);
        setStatsElf(dexterity, intelligence);

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