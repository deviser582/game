import java.util.Random;
import java.util.Scanner;

class Monster {
    private String name;
    private char life;
    private char attack;
    static int lif1,att1;
    public Monster(String name,char life,char attack){
        this.setName(name);
        this.setLife(life);
        this.setAttack(attack);
    }
    public void setName(String a){
        name=a;
    }
    public void setLife(char b){
        life=b;
    }
    public void setAttack(char c){
        attack=c;
    }
    public String getName(){
        return name;
    }
    public char getLife(){
        return life;
    }
    public char getAttack(){
        return attack;
    }
    public int lif(char life){
        Random random=new Random();
        switch (life){
            case 'A':
                lif1=random.nextInt(15)+50;
                break;
            case 'B':
                lif1=random.nextInt(15)+40;
                break;
            case 'C':
                lif1=random.nextInt(15)+30;
                break;
        }
        return lif1;
    }
    public int att(char attack){
        Random random=new Random();
        switch (attack){
            case 'A':
                att1=random.nextInt(5)+18;
                break;
            case 'B':
                att1=random.nextInt(5)+14;
                break;
            case 'C':
                att1=random.nextInt(5)+10;
                break;
        }
        return att1;
    }
    public String set1(){
        Scanner t = new Scanner(System.in);
        System.out.println("请输入敌人的名字");
        String name1 = t.nextLine();
        setName(name1);
        return name1;
    }
    public char set2(){
        Scanner t = new Scanner(System.in);
        System.out.println("请输入敌人的攻击属性");
        char att=t.next().charAt(0);
        setAttack(att);
        return att;
    }
}
