# 211.Add_and_Search_Word_Data_structure_design
Design a data structure that supports the following two operations:

void addWord(word)
bool search(word)
search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.


# Example :
```
addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true

```



# My Solution :
```
class WordDictionary {
    Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();
    /** Initialize your data structure here. */
    public WordDictionary() {
        
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        int len = word.length();
        if(!map.containsKey(len)){
            List<String> words = new ArrayList<>();
            words.add(word);
            map.put(len,words);
        }
        else{
            map.get(len).add(word);
        }
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        int len = word.length();
        if(!map.containsKey(len)) return false;
        if(isWord(word)) return map.get(len).contains(word);
        for(String s :map.get(len)){
            if(isSame(word,s)) return true;
        }
        return false;
    }
    
    public boolean isWord(String word){
        for(char c : word.toCharArray()){
            if(!Character.isLetter(c)) return false;
        }
        return true;
    }
    public boolean isSame(String word, String s){
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)!='.' && word.charAt(i)!=s.charAt(i)) return false;
        }
        return true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

```
