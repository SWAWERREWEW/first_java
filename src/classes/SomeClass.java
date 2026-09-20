package classes;

public class SomeClass {

public void functionf(double x){
double[] tabley = new double[5];
for(int i = 0; i < tabley.length; i++){tabley[i] = (x+i)*(x+i);}
for(int i = 0; i < tabley.length; i++){pri.n(tabley[i]); pri.n(" ");}
pri.nt("");}

public double up(double n, int t){
double result = n;
for(int i = 0; i < t-1; i++){result = result * n;}
return result;}

public void functiony(double[] lil){
double[] tabley = new double[lil.length];
for(int i = 0; i < tabley.length; i++){tabley[i] = up(lil[i], 2);}
for(int i = 0; i < tabley.length; i++){pri.n(tabley[i]); pri.n(" ");}
pri.nt("");}
}

class pri{public static void nt(Object s){System.out.println(s);}
public static void n(Object s){System.out.print(s);}}
