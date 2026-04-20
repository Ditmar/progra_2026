public class TextValidator {
    public static void valid(String content) {
        Integer contentLength = content.length();
        String newContent = content.toUpperCase();
        newContent = newContent.replace("\s", "*");
        Boolean isWith = content.startsWith("Hola soy german");
        System.out.println("Text without changes ");
        System.out.println(content);
        System.out.println("Text with changes ");
        System.out.println(newContent);
        System.out.println("Text length: " + contentLength);
        System.out.println("Text starts with 'Hola soy german': " + isWith);
    }
}
