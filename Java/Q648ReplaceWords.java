class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        //Initialise a hashmap with key as first character of a string and value as list of strings starting with the character
        HashMap<Character, ArrayList<String>> newDict = new HashMap<>();

        //Populate hashmap with words from given dictionary
        for(String word: dictionary){
            char c = word.charAt(0);
            newDict.putIfAbsent(c, new ArrayList<String>());
            newDict.get(c).add(word);
        }

        //Split sentence into words
        List<String> wordSplit = Arrays.asList(sentence.split(" "));

        //Replace word with root if found in hashmap
        for (int i = 0; i < wordSplit.size(); i++) {
            String word = wordSplit.get(i);
            List<String> list = newDict.getOrDefault(word.charAt(0), new ArrayList<>());
            for (String prefix : list) {
                if (wordSplit.get(i).startsWith(prefix)) {
                    wordSplit.set(i, prefix);
                }
            }
        }

        return String.join(" ", wordSplit);
    }
}
