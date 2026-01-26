class Solution {
    public String sortSentence(String s) {
        String[] words= s.split(" ");

        HashMap<Integer,String> map= new HashMap<>();
        for(String word: words){

            int len= word.length();

            int pos= word.charAt(len -1) - '0';

            String ac= word.substring(0, len-1);

            map.put(pos, ac);
        }
        StringBuilder sb= new StringBuilder();
        for(int i=1; i<=words.length; i++){
            sb.append(map.get(i));

            if(i != words.length){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}