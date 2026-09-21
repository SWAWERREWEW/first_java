import java.io.*;

public class write_read_files {
public static void write_file(String s, String path){
try(  PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path)))  )
{writer.println(s);}
catch (IOException e) {System.err.println(e.getMessage());} }

public static void read_file(String path){
try(  BufferedReader reader = new BufferedReader(new FileReader(path));  ){
String line;
while(  (line=reader.readLine())!=null  ) {pri.nt(line);}}
catch (IOException e) {System.err.println(e.getMessage());}  }

public static String[] input_file(String path){
String[] lil = new String[9999999];
int len_lil = 0;
String line;
try(  BufferedReader reader = new BufferedReader(new FileReader(path));  ){
while(  (line=reader.readLine())!=null  ) {len_lil++; lil[len_lil] = line;}
} catch (IOException e) {System.err.println(e.getMessage());}
return lil;}
}
