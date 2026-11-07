package responsi;

public class humanKnight extends karakter implements human,physical{
    int mana;
    public humanKnight(String name, int hp){
        super(name, hp);
        mana = maxMana;
        System.out.println(name +" hp: " +getHp()+ " mana: " +mana+"\n");
    }
    public humanKnight(String name, int hp, boolean bindingvow){
        super(name, hp,bindingvow);
        if (getBindingvow()){
            mana = 2*maxMana;
            halveHp();
            System.out.println(name+" hp: " +getHp()+ " mana: " +mana+"\n");
        }else {
            System.out.println(name+" hp: " +getHp()+ " mana: " +mana+"\n");
        }
    }
    public void check(){
        super.bindingvowCheck();
        if (getBindingvow()){
            System.out.println("bindingvow effect: skill hit harder, double max mana, " +
                    "double mana gain by using basicattack, halve the Health.\n");
        }
    }
    public int skillCost(int i){
        int cost = mana - (i*30);
        if (mana >= 0){
            mana = cost;
        }
        return cost;
    }

    public void basicAttack (){
        if (getBindingvow()){
            int manaRegen = 40;
            mana = mana + manaRegen;
            if (mana > 200){
                mana = 200;
            }
            System.out.println(getName()+ " dealing " +typeDmg+ " damage and regen 40 mana");
            System.out.println(getName()+ " hp: " + getHp() + " mana: " + mana+"\n");
        } else {
            int manaRegen = 20;
            mana = mana + manaRegen;
            if (mana > 100) {
                mana = 100;
            }
            System.out.println(getName()+ " dealing " +typeDmg+ " damage and regen 20 mana");
            System.out.println(getName()+ " hp: " + getHp() + " mana: " + mana+"\n");
        }
    }
    public void useSkill(int i){
        if (i <= getSkillSlot()-1) {
            if (skillCost(i+1) < 0){
                System.out.println(getName()+ " doesn't have enough mana");
                System.out.println(getName()+ " hp: " + getHp() + " mana: " + mana+"\n");
            }else {
                if (getBindingvow()) {
                    System.out.println(getName()+ " use skill " + getSkill(i) + " dealing double " + typeDmg + " damage");
                    System.out.println(getName()+ " hp: " + getHp() + " mana: " + mana+"\n");
                } else {
                    System.out.println(getName()+ " use skill " + getSkill(i) + " dealing " + typeDmg + " damage");
                    System.out.println(getName()+ " hp: " + getHp() + " mana: " + mana+"\n");
                }
            }
        }else {
            System.out.println(getName()+ " doesn't have that skill slot");
            System.out.println(getName()+ " hp: " +getHp()+ " mana: " +mana+"\n");
        }
    }

}
