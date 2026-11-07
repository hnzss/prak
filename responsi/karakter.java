package responsi;

public abstract class karakter {
    private String name;
    private int hp;
    private String[] skill;
    private int skillSlot = 0;
    private final boolean bindingvow;
    public static final int death = 0;

    public karakter(String name,int hp){
        this.name = name;
        this.hp = hp;
        skill = new String[5];
        bindingvow = false;
    }
    public karakter(String name, int hp, boolean bindingvow){
        this.name = name;
        this.hp = hp;
        this.bindingvow = bindingvow;
        skill = new String[5];
    }

    public void bindingvowCheck(){
        if (bindingvow) {
            System.out.println(name+" have bindingvow");
        }else {
            System.out.println(name+" doesn't have binding vow\n");
        }
    }

    public String getName(){
        return name;
    }
    public void halveHp (){
        hp = hp / 2;
    }
    public int getHp (){
        return hp;
    }
    public void setHp (int hp) {
        this.hp = hp;
    }
    public boolean getBindingvow (){
        return bindingvow;
    }
    public void setSkill(String skill){
        this.skill[skillSlot]=skill;
        skillSlot = skillSlot + 1;
    }
    public String getSkill(int i){
        return skill[i];
    }
    public int getSkillSlot(){
        return skillSlot;
    }
    public abstract int skillCost(int i);

}
