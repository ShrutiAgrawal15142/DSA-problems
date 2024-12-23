class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = 0;

        for (String str : strs) {
            if (isNumeric(str)) {
                maxValue = Math.max(maxValue, Integer.parseInt(str));
            } else {
                maxValue = Math.max(maxValue, str.length());
            }
        }

        return maxValue;
    }
    private boolean isNumeric(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}