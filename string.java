public class string {
    public static void main(String[] args) {
        String name= "Hannan";
        int value = name.length();// calculates the length of the string
        System.out.println(value);
        String value1= name.toLowerCase();// converts to lowercase
        System.out.println(value1);
        String value2 = name.toUpperCase();//converts to uppercase
        System.out.println(value2);
        System.out.println(name.substring(2));//starts from the mentioned index
        System.out.println(name.substring(2,5));//starts from the mentioned index but doesnt include the last index
        System.out.println(name.replace('a','s'));//replaces the letter
        System.out.println(name.startsWith("Han"));//starts from the mentioned index
        System.out.println(name.endsWith("an"));//ends from the mentioned index
        
    }
    
}
