class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        ArrayList<Character> sChars = new ArrayList<>();
        ArrayList<Character> tChars = new ArrayList<>();

        for (int i = 0; i < s.length(); i++)
        {
            sChars.add(s.charAt(i));
            tChars.add(t.charAt(i));
        }

        Collections.sort(sChars);
        Collections.sort(tChars);

        int j = 0;
        for (int i = 0; i < sChars.size(); i++)
        {   
            if (!sChars.get(i).equals(tChars.get(i)))
            {
                return false;
            }
        }

        return true;
    }
}
