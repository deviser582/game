import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String arg[]){
        int hero_life=0,hero_att=0,hero_def=0;
        int mon_life=0,mon_att=0;
        String hero_name=null,mon_name=null;
        String name="RX-93V",name1="MSN-04";
        char A='B',B='C',C='A';

        System.out.println("想要自定义名字吗？\n1.想   1.不想");
        Scanner g=new Scanner(System.in);
        int h=g.nextInt();
        Hero her1 = new Hero(name, 'A', 'B', 'C');
        Hero her2 = new Hero("RX-78-2", 'B', 'C', 'A');
        Hero her3 = new Hero("EXIA", 'C', 'A', 'B');
        Monster mon1 = new Monster(name1, 'A', 'A');
        Monster mon2 = new Monster("MS-06S", 'A', 'B');
        Monster mon3 = new Monster("GNX-U02X", 'B', 'A');
        if(h==1){
            name=her1.set();
            A=her1.set1();
            B=her1.set2();
            name1=mon1.set1();
            C=mon1.set2();
        }
        //敌人设置牛头人有彩蛋
        System.out.println("请选择你的英雄");
        System.out.println("1."+her1.getName()+"  2."+her2.getName()+"  3."+her3.getName());
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        switch (p){
            case 1:
                System.out.println("你选择了"+her1.getName()+"生命：A  攻击：B  防御：C");
                hero_life=her1.lif(her1.getLife());
                hero_att=her1.att(her1.getAttack());
                hero_def=her1.def(her1.getDefence());
                hero_name=her1.getName();
                break;
            case 2:
                System.out.println("你选择了"+her2.getName()+"生命：B  攻击：C  防御：A");
                hero_life=her2.lif(her2.getLife());
                hero_att=her2.att(her2.getAttack());
                hero_def=her2.def(her2.getDefence());
                hero_name="RX-78-2";
                break;
            case 3:
                System.out.println("你选择了"+her3.getName()+"生命：C  攻击：A  防御：B");
                hero_life=her3.lif(her3.getLife());
                hero_att=her3.att(her3.getAttack());
                hero_def=her3.def(her3.getDefence());
                hero_name="EXIA";
                break;
        }

        System.out.println("请选择你的对手");
        System.out.println("1."+mon1.getName()+"  2."+mon2.getName()+"  3."+mon3.getName());
        int q=s.nextInt();
        switch (q){
            case 1:
                System.out.println("你选择了"+mon1.getName()+"生命：A  攻击：A");
                mon_life=mon1.lif(mon1.getLife());
                mon_att=mon1.att(mon1.getAttack());
                mon_name=mon1.getName();
                break;
            case 2:
                System.out.println("你选择了"+mon2.getName()+"生命：A  攻击：B");
                mon_life=mon2.lif(mon2.getLife());
                mon_att=mon2.att(mon2.getAttack());
                mon_name="MS-06S";
                break;
            case 3:
                System.out.println("你选择了"+mon3.getName()+"生命：B  攻击：A");
                mon_life=mon3.lif(mon3.getLife());
                mon_att=mon3.att(mon3.getAttack());
                mon_name="GNX-U02";
                break;
        }

        System.out.println("对战开始");
        int a,b,c;
        for(int i=1;1<20;i++){
            a=mon_att-hero_def;
            if(a<1){
                a=1;
            }
            System.out.println("第"+i+"回合");
            System.out.println(hero_name+"对"+mon_name+"造成"+ hero_att+"点伤害");
            b= mon_life-hero_att;
            mon_life=b;
            if(b<=0){
                System.out.println(her1.getName()+"获胜");
                if (mon1.getName().equals("牛头人")){
                    System.out.println("劳资一刀一个牛头人！");
                }
                System.out.println("回合结束");
                break;
            }
            System.out.println(mon_name+"对"+hero_name+"造成"+a+"点伤害");
            c= hero_life-a;
            hero_life=c;
            System.out.println("回合结束");
            if(c<=0){
                System.out.println(mon1.getName()+"获胜");
                System.out.println("回合结束");
                break;
            }
            System.out.println("是否继续战斗\n1：战斗  2：逃跑");
            int w=s.nextInt();
            if(w==2){
                System.out.println("你个辣鸡为什么要逃跑");
                System.out.println("1.劳资要继续战斗   2.我个菜鸡就是要跑");
                int v= s.nextInt();
                if(v==1){
                    System.out.println("那就继续把");
                }else{
                    System.out.println("辣鸡再见！");
                    break;
                }
            }
        }
    }
}
