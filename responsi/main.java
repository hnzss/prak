package responsi;

public class main {
    public static void main (String[] args){
        System.out.println("character 1");
        physical char1 = new humanKnight("suroso",200,true);
        ((humanKnight) char1).check();
        ((humanKnight) char1).setSkill("sword dance");
        ((humanKnight) char1).setSkill("slash barage");
        char1.useSkill(0);
        char1.basicAttack();
        char1.basicAttack();
        char1.useSkill(1);
        char1.useSkill(2);
        char1.useSkill(1);
        char1.useSkill(1);
        char1.useSkill(1);
        System.out.println("character 3");
        physical char2 = new humanKnight("budi",200);
        ((humanKnight) char2).check();
        ((humanKnight) char2).setSkill("sword dance");
        ((humanKnight) char2).setSkill("slash barage");
        char2.useSkill(0);
        char2.basicAttack();
        char2.basicAttack();
        char2.useSkill(1);
        char2.useSkill(2);
        System.out.println("character 2");
        magical char3 = new orcShaman("samson",200);
        ((orcShaman) char3).check();
        ((orcShaman) char3).setSkill("blood shot");
        ((orcShaman) char3).setSkill("blood bath");
        char3.cast(0);
        char3.cast(1);
        char3.cast(2);
        System.out.println("character 4");
        magical char4 = new orcShaman("samsu",200,true);
        ((orcShaman) char4).check();
        ((orcShaman) char4).setSkill("blood shot");
        ((orcShaman) char4).setSkill("blood bath");
        char4.cast(0);
        char4.cast(1);
        char4.cast(2);
        char4.cast(1);
        char4.cast(1);
        char4.cast(1);
        char4.cast(1);
        char4.cast(1);
        char4.cast(1);
    }
}
