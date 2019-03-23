/*
* Universidad del Valle de Guatemala
* Hoja 7 Algoritmos y estructuras de datos
* Roberto Figueroa 18306
* Michael Chan 18562
*
* */

public class Main {

    public static void main(String[] args) {
        String textTest;
        String dictionary;

        ArrayList<String> text = new ArrayList<String>();
        ArrayList<String> dict = new ArrayList<String>();

        try {
            FileReader file = new FileReader("test.txt");
            BufferedReader reader = new BufferedReader(file);
            while ((textTest = reader.readLine()) != null) {
                text.add(textTest);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }

        for (int i = 0; i < text.size(); i++) {
            text.set(i, text.get(i).trim());
        }

        for (int i = 0; i < text.size(); i++) {
            System.out.println("-" + text.get(i) + "-");
        }
        System.out.println(text.size());

        textTest = "";
        for (int i = 0; i < text.size(); i++) {
            textTest += text.get(i) + " ";
        }
        textTest.trim();
        textTest = textTest.replaceAll("  *", " ");
        String[] tokens = textTest.split(" ");
        System.out.println(textTest);
        for (String s : tokens) {
            System.out.println(s);
        }

        try {
            FileReader file = new FileReader("dict.txt");
            BufferedReader reader = new BufferedReader(file);
            while ((dictionary = reader.readLine()) != null) {
                dict.add(dictionary);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }

        for (int i = 0; i < dict.size(); i++) {
            dict.set(i, dict.get(i).trim());
        }

        for (int i = 0; i < dict.size(); i++) {
            System.out.println("-" + dict.get(i) + "-");
        }
        System.out.println(text.size());

        dictionary = "";
        for (int i = 0; i < dict.size(); i++) {
            dictionary += dict.get(i) + " ";
        }
        dictionary.trim();
        dictionary = dictionary.replaceAll("(","");
        dictionary = dictionary.replaceAll(")","");
        dictionary = dictionary.replaceAll("  *", " ");
        String[] words = dictionary.split(" ");
        System.out.println(dictionary);
        String[] keys;
        String[] values;
        for (int i = 0,i < words.length(),i++) {
            if((i % 2) == 0){
                keys.add(words[i]);
            } else {
                values.add(words[i]);
            }
        }
        for (int i = 0,i < keys.length(),i++) {
            insertRec(keys[i],values[i]);
        }
}
