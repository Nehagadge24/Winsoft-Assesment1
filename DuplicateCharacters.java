import java.util.HashMap;
public class DuplicateCharacters 
{
    public static void main(String[] args) 
    {
        String str = "programming";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) 
	{
            if (charCountMap.containsKey(ch)) 
	    {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } 
	    else 
	    {
                charCountMap.put(ch, 1);
            }
        }
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (char ch : charCountMap.keySet()) 
	{
            if (charCountMap.get(ch) > 1) 
	    {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }
}
