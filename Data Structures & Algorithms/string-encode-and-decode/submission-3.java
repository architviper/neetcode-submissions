class Solution {

    public String encode(List<String> strs) {
          StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }

        return sb.toString();

    }

    public List<String> decode(String s) {
    
          List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // find the '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // parse the length
            int len = Integer.parseInt(s.substring(i, j));

            // extract the string
            j++; // skip '#'
            String str = s.substring(j, j + len);
            res.add(str);

            // move to next encoded piece
            i = j + len;
        }

        return res;
    }
}
