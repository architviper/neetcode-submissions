class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] str1 = str.toCharArray();
            Arrays.sort(str1);
            String str2= Arrays.toString(str1);
            map.putIfAbsent(str2, new ArrayList<>());
            map.get(str2).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
