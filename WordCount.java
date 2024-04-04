import java.util.HashMap;
public class WordCount
{
    public static void main(String[] args) 
    {
        String sentence = "This is a sample sentence to demonstrate word count using HashMap";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = sentence.split("\\s+");
        for (String word : words) 
	{
            word = word.replaceAll("[^a-zA-Z]", "");
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) 
	    {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } 
	    else 
	    {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) 
	{
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
