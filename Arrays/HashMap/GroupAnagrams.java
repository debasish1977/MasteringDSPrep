//Clarifying Questions
//Can the input array be empty?
//Input array can contain only lowercase english letters?

//Approach
//For each string, I'll build a 26-element character-frequency vector. All anagrams have exactly the same frequency vector,
//so I'll serialize that vector into a canonical key and use it to group strings in a hash map.

//Time Complexity: O(M*N)
//Space Complexity: O(M*N)
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        if(strs==null) return result;
        for(String str:strs) {
            int[] freq = new int[26];
            for(char ch:str.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder strBuild = new StringBuilder();
            for(int i=0;i<26;i++){
                strBuild.append('#');
                strBuild.append(freq[i]);
            }
            String Key = strBuild.toString();
            if(!map.containsKey(Key)){
                map.put(Key,new ArrayList<>());
            }
            map.get(Key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}