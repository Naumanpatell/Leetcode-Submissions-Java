class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> hash_s = new HashMap<>();
        Map<Character, Integer> hash_t = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hash_s.put(ch, hash_s.getOrDefault(ch,0) + 1);
        }

        for (char ch : t.toCharArray()) {
            hash_t.put(ch, hash_t.getOrDefault(ch,0) + 1);
        }

        if (hash_t.equals(hash_s)) {
            return true;
        }
        else{
            return false;
        }
    }
}