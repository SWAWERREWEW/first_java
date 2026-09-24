class pri{public static void nt(Object s){System.out.println(s);}
public static void n(Object s){System.out.print(s);}}

public class Main {
public static double up(double n, int t){
double result = n;
for(int i = 0; i < t-1; i++){result = result * n;}
return result;}

public static void main(String[] args){
pri.nt("genshin impact");
write_read_files.write_file("sdsdsdsd\nfefefefe", "src\\lol.txt");
write_read_files.read_file("src\\lol.txt");
//pri.nt("is really input ❓");
//String[] input_lil = write_read_files.input_file("src\\lol.txt");
//pri.nt(input_lil[2]);

write_read_files.write_file(
"Операционная система " + System.getProperty("os.name") + "\n" +
"Версия ядра " + System.getProperty("os.version") + "\n" +
"Архитектура " + System.getProperty("os.arch") + "\n",
"src\\new_text.txt");

String[] input_txt = write_read_files.input_file("src\\input.txt");
pri.nt(input_txt[1]);
double number_from_input = Double.parseDouble(input_txt[3]);
pri.nt(number_from_input);
int[] lil_number = {1, 2, 3, 4};
for(int i=0; i<lil_number.length; i++){pri.nt(lil_number[i]);}

pri.nt("Чтение всего текстового файла");
for(int i=1; i < input_txt.length & input_txt[i] != null; i++){pri.nt(input_txt[i]);}

for(int i = 0; i<9; i++){pri.n("-");} pri.n("Условия"); for(int i = 0; i<9; i++){pri.n("-");} pri.nt("");
pri.nt("Напечатать строки с началом 'ra'");
for(int i = 0; i<9; i++){pri.n("-");} pri.n("Результат"); for(int i = 0; i<9; i++){pri.n("-");} pri.nt("");

//for(int i=1; i < input_txt.length & input_txt[i] != null; i++){
//try {
//if(input_txt[i].substring(0, 2).equalsIgnoreCase("ra") & input_txt[i].substring(0, 2).intern() == "ra")
//{pri.nt(input_txt[i]);}
//} catch (IOException e) {System.err.println(e.getMessage());}  }

for(int i=1; i < input_txt.length & input_txt[i] != null; i++){
String непуст = "  ";
if(input_txt[i].intern() != ""){непуст = input_txt[i];}
if(непуст.substring(0, 2).equalsIgnoreCase("ra") & непуст.substring(0, 2).intern() == "ra")
{pri.nt(input_txt[i]);}}


double y0 = 1.31522; double y1 = 1.31230; double y2 = 1.32730; double y3 = 1.33353; double h = 0.002;
double fx2 = 1/(6*h) * (y0 - 6*y1 + 3*y2 + 2*y3);
double fx3 = 1/(6*h) * (-2*y0 + 9*y1 - 18*y2 + 11*y3);
pri.nt("О господь🌌"); pri.nt(fx2); pri.nt(fx3);

double fx0 = 1/(  6*up(h, 2)  ) * (12*y0 - 30*y1 + 24*y2-6*y3);
double fx1 = 1/(  6*up(h, 2)  ) * ( 6*y0 - 12*y1 + 6*y2);
fx2 =        1/(  6*up(h, 2)  ) * ( 6*y1 - 12*y2 + 6*y3);
fx3 =        1/(  6*up(h, 2)  ) * (-6*y0 + 24*y1 - 30*y2 + 12*y3);
pri.nt("О господь🌌🔥"); pri.nt(fx0); pri.nt(fx1); pri.nt(fx2); pri.nt(fx3);

String[] lil_values = new String[999];
int[] lil_lengths = new int[999];
int length_data = 0;

pri.nt("------- Строки с буквой a -----");
for(int i=1; i<input_txt.length & input_txt[i] != null; i++){
lil_values[i] = input_txt[i];
lil_lengths[i] = input_txt[i].length();
length_data++;}

//for(int i=1; i<length_data; i++){
//// pri.n(lil_values[i] + " &="); pri.n(lil_lengths[i]); pri.nt("");
//for(int ii=0; ii<lil_lengths[i]; ii++){
//// if(lil_values[i].substring(ii, ii+1).intern() == "a"){pri.nt(lil_values[ii] +" Строка с буквой a найдена✅");}
//pri.n(ii); pri.n(ii+1); pri.nt(" " + lil_values[i].substring(ii, ii+1));
//if(lil_values[i].substring(ii, ii+1).equalsIgnoreCase("a")){pri.nt("Буква a ✅✅✅☕");}  }
//pri.nt("next row");}

for(int i=1; i<length_data+1; i++){
String need_row = "";
for(int ii=0; ii<lil_lengths[i]; ii++){
if((lil_values[i]).substring(ii, ii+1).equalsIgnoreCase("a"))
{need_row = lil_values[i];}  }
if(!need_row.equalsIgnoreCase("")){pri.nt(need_row);}  }

//Map<String, Integer> словарь = new HashMap<>();
//словарь.put("ключ", 42); // Отсылка к произведению Дугласа Адамса «Автостопом по галактике»
//Integer значение = словарь.get("ключ");
//pri.nt(значение); pri.nt(словарь);
// // with error
// // java: cannot find symbol
// // symbol:   class Map
// // location: class Main

}}
