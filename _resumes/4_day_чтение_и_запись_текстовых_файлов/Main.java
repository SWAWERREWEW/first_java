class pri{public static void nt(Object s){System.out.println(s);}
public static void n(Object s){System.out.print(s);}}

public class Main {
public static void main(String[] args){
pri.nt("genshin impact");
write_read_files.write_file("sdsdsdsd\nfefefefe", "src\\lol.txt");
write_read_files.read_file("src\\lol.txt");
pri.nt("is really input ❓");
String[] input_lil = write_read_files.input_file("src\\lol.txt");
pri.nt(input_lil[2]);

String[] input_txt = write_read_files.input_file("src\\input.txt");
pri.nt(input_txt[1]);
double number_from_input = Double.parseDouble(input_txt[3]);
pri.nt(number_from_input);
int[] lil_number = {1, 2, 3, 4};
for(int i=0; i<lil_number.length; i++){pri.nt(lil_number[i]);}  }
// for(int i=0; i<input_txt.length; i++){pri.nt(input_txt[i]);}
}
