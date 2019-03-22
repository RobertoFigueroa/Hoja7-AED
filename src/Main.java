/*
*Universidad del Valle de Guatemala
* Hoja 7 Algoritmos y estructuras de datos
* Roberto Figueroa 18306
* Michael Chan 18
*
* */

public class Main {

    public static void main(String[] args) {
        String textTest;

        ArrayList<String> text = new ArrayList<String>();

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
    }
}
