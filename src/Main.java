public class Main {
    public static void main(String[] args) {
        pri.nt("ok");
        Kikidon.main();
    }
}

class pri{public static void nt(String s){System.out.println(s);}
public static void nmber(float n){System.out.println(n);}}

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
pri.nt("rrr");
}}

class Kikidon {public static void main(){
                  int крит_урон = 145;    int крит_шанс = 76;
int крит_масса =      крит_урон         +     крит_шанс       * 2; pri.nmber(крит_масса);

float числитель   =     (9 + 9) * 3 + 1;
//                     -----------------
float знаминатель =       (5 + 4) * 6;
pri.nmber(числитель / знаминатель);
}}
