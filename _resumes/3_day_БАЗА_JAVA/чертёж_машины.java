public class чертёж_машины {

public String wheels_is_public = "количество колёс 4";
private String secret_details = "ключи от машины или замок";
String is_default_stats = "Характеристики уникальные для региона";
protected String is_proctected;

public String get_key(){return secret_details;}
public void edit_secret_details(String new_secret_details){secret_details = new_secret_details;}
}

//public abstract class Animal{
//    public abstract void eat();
//    public int age;
//}
