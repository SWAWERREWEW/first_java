// src/Main.java
public class Main {public static void main(String[] args) {
pri.nt("ok");
Kikidon.main();
russian.Hello.main();
}}

class pri{public static void nt(Object s){System.out.println(s);}}

class Kikidon {public static void main(){

//String[] lil = ["efef"];
//System.out.println(lil);

                  int крит_урон = 145;    int крит_шанс = 76;
int крит_масса =      крит_урон         +     крит_шанс       * 2; pri.nt(крит_масса);

float числитель   =     (9 + 9) * 3 + 1 + 1;
//                     ---------------------
float знаминатель =       (5 + 4) * 6;
pri.nt(числитель / знаминатель);

if(числитель / знаминатель >= 0){pri.nt("Число больше либо равно нулю или либо равно числу");}
else{pri.nt("А всмысле?");}
for(int i = 0; i < 9; i = i + 2){pri.nt(100);}

int i = 0; do {pri.nt("wtf"); i++;} while (i < 4);

int[] набор_чисел = new int[3]; набор_чисел[0] = 2; набор_чисел[1] = 2; набор_чисел[2] = 3;
pri.nt(набор_чисел);
for(int ii = 0; ii < набор_чисел.length; ii++){pri.nt(набор_чисел[ii]);}

int[] lol_lil = new int[5];
System.out.print("lol_lil "); pri.nt(lol_lil);
for(int ii = 0; ii < lol_lil.length; ii++){lol_lil[ii] = 2;}
for(int ii = 0; ii < lol_lil.length; ii++){pri.nt(lol_lil[ii]);}

чертёж_машины car = new чертёж_машины();
pri.nt(car.is_default_stats);
pri.nt(car.wheels_is_public);
pri.nt(car.get_key());
// изменение публичного параметра для отдельного объекта
car.wheels_is_public = "колёса убраны";
pri.nt(car.wheels_is_public);
pri.nt("Новая машина");
чертёж_машины new_car = new чертёж_машины();
pri.nt(new_car.wheels_is_public);

classes.Cat cat_Tom = new classes.Cat();
cat_Tom.age = 4;
cat_Tom.favorite_food = "fish";
cat_Tom.eat();
cat_Tom.meow();

classes.SomeClass math = new classes.SomeClass();
math.functionf(6.7);
pri.nt(math.up(9, 2));
double[] lilx = new double[5];
for(int ii = 0; ii < lilx.length; ii++){lilx[ii] = 2;}
math.functiony(lilx);
}}

class ExampleCode {public static void main(){
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    System.out.printf("Hello and welcome! ");
    String first = "kikidon"; System.out.println(first);
    for (int i = 1; i <= 5; i++) {System.out.println("i = " + i);}
}}
