public class LineProccesing {

    public static boolean isEmptyLine(String line) throws IllegalAccessException {
        if (line != null && line.length() > 0) {
            return true;
        } else {
            throw new IllegalAccessException("Ввод не должен быть пустым"); 
        }
        
    }
}
