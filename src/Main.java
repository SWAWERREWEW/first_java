class pri{public static void nt(Object s){System.out.println(s);}
public static void n(Object s){System.out.print(s);}}

public class Main {
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
{pri.nt(input_txt[i]);}  }

}}
