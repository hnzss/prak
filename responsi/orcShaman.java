package responsi;

public class orcShaman extends karakter implements orc,magical{
    int hpRegen;
    public orcShaman(String name, int hp){
        super(name, hp);
        System.out.println(name +" hp: " +getHp()+ "\n");
    }
    public orcShaman(String name, int hp,boolean bindingvow){
        super(name, hp, bindingvow);
        hpRegen = (int) (getHp() * 0.10);
        System.out.println(name +" hp: " +getHp()+ "\n");
    }

    public void check(){
        super.bindingvowCheck();
        if (getBindingvow()){
            System.out.println("bindingvow effect: skill hit harder, double the blood cost, get regen every action.\n");
        }
    }
    public int skillCost(int i) {
        int cost;
        if (getHp() < death){
            System.out.println(getName()+ " dead");
        }else {
            if (getBindingvow()) {
                cost = getHp() - (2*hpCost);
                if (cost > 0) {
                    setHp(cost);
                    setHp(cost + hpRegen);
                    System.out.println(getName() + " use skill " + getSkill(i) + " dealing double " + typeDmg + " damage");
                    System.out.println(getName()+ " regen " +hpRegen+ "health\n");
                    System.out.println(getName() + " hp: " + getHp() + "\n");
                } else {
                    System.out.println("the spell can kill the user");
                    System.out.println(getName()+ " regen " +hpRegen+ "health\n");
                    setHp(cost + hpRegen);
                    System.out.println(getName() + " hp: " + getHp() + "\n");
                }
            } else {
                cost = getHp() - hpCost;
                if (cost > 0) {
                    setHp(cost);
                    System.out.println(getName() + " use skill " + getSkill(i) + " dealing double " + typeDmg + " damage");
                    System.out.println(getName() + " hp: " + getHp() + "\n");
                } else {
                    System.out.println("the spell can kill the user");
                    System.out.println(getName() + "meditate to regen 20 hp");
                    setHp(getHp() + 20);
                    System.out.println(getName() + " hp: " + getHp() + "\n");
                }
            }
        }

        return 0;
    }
        public void cast(int i){
            if (i <= getSkillSlot()-1) {
                skillCost(i);
            }else {
                System.out.println(getName() + " doesn't have that skill slot");
                System.out.println(getName() + " hp: " + getHp() + "\n");
            }
        }
}
