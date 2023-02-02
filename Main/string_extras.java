package Main;

public class string_extras {
  public static void main(String[] args) {
    // Formatar:toLowerCase(), toUpperCase(), trim()
    // Recortar: substring(inicio), substring(inicio,fim)
    // Substituir: replace(char, char), replace(string,string)
    // Buscar: IndexOf, LastIndexOf
    // str.split("")

    String original = "abcde FGHIJ ABC abc DEFG";

    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(2, 9);
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xy");
    int i = original.indexOf("bc");
    int j = original.lastIndexOf("bc");
    String s = "potato apple lemon orange";

    String[] vect = s.split("\s");

    System.out.println(vect[0]);
    System.out.println(vect[1]);
    System.out.println(vect[2]);
    System.out.println(vect[3]);

    System.out.println("Original -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "- Letra Minuscula");
    System.out.println("toUpperCase: -" + s02 + "- Letra Maiuscula");
    System.out.println("trim: -" + s03 + "- elimina os espaços em branco no canto");
    System.out.println("substring: -" + s04 + "- remove até o 2o caracter da string");
    System.out.println("substring: -" + s05 + "- remove até o 2o caracter da string até o 9o");
    System.out.println("replace: -" + s06 + "- substituir o a por x");
    System.out.println("replace: -" + s07 + "- substituir abc por xy");
    System.out.println("Index of 'bc: " + i);
    System.out.println("Last index of 'bc': " + j);
  }
}
