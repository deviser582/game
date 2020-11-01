import java.util.Random;
import java.util.Scanner;

class Hero {
    private String name;
    private char life;
    private char attack;
    private char defence;
    static int lif1,att1,def1;
    public Hero(String name,char life,char attack,char defence){
        this.setName(name);
        this.setLife(life);
        this.setAttack(attack);
        this.setDefence(defence);
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
    public void setDefence(char d){
        defence=d;
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
    public char getDefence(){
        return defence;
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
    public int def(char defence){
         Random random=new Random();
         switch (defence){
             case 'A':
                 def1=random.nextInt(3)+10;
                 break;
             case 'B':
                 def1=random.nextInt(3)+7;
                 break;
             case 'C':
                 def1=random.nextInt(3)+4;
                 break;
         }
         return def1;
    }
    public String set(){
        Scanner t = new Scanner(System.in);
        System.out.println("请输入你英雄的名字");
        String name = t.nextLine();
        setName(name);
        return name;
    }
    public char set1(){
        Scanner t = new Scanner(System.in);
        System.out.println("请输入你英雄的攻击属性");
        char att=t.next().charAt(0);
        setAttack(att);
        return att;
    }
    public char set2(){
        Scanner t = new Scanner(System.in);
        System.out.println("请输入你英雄的防御属性");
        char def=t.next().charAt(0);
        setAttack(def);
        return def;
    }
}
