class Solution {


    public String generateWord(String s){
        int[] count = new int[26];

        for(int i = 0 ;i< s.length();i++){
            count[s.charAt(i) - 'a']++;
        }

        StringBuilder st = new StringBuilder();
        for(int i =0; i<count.length;i++){
            if(count[i]>0){
                st.append(String.valueOf((char) (i + 'a')).repeat(count[i]));
            }
        }
        return st.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        //without sorting

        HashMap<String, List<String>> hs = new HashMap<>();

        for(String s :  strs){
            String newWord = generateWord(s);

            if(!hs.containsKey(newWord)){
                hs.put(newWord, new ArrayList<>());
            }
            hs.get(newWord).add(s);
        }

        return new ArrayList<>(hs.values());
    }
}
