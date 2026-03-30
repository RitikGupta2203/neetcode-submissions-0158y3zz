class Solution {
    //for the encode:
    //create a new str try to add the length of string + delimeter + followed by string value
    public String encode(List<String> strs) {
    
        String res = "";

        for (String str: strs){
            String len =  String.valueOf(str.length());;

            res += len + "#" + str;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            //get the word
            i = j+1;
            res.add(str.substring(i, i + length));
            i = i+ length;
        }
        return res;
    }
}
