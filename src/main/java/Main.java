public class Main {


    public static void main(String[] args) {

        Solution solution = new Solution();

        String []strArray = {"flower", "flow", "flight"};
        System.out.println("<------------------------------ Longest Common Prefix ------------------------------>");
        System.out.println(solution.longestCommonPrefix(strArray));

        String str = "[({})()()()[]{}]";
        System.out.println("<-------------------------------- Valid Parentheses -------------------------------->");
        System.out.println(solution.isValid(str));

        System.out.println("<----------------------------------- Climb Stairs ---------------------------------->");
        System.out.println(solution.climbStairs(4));

        System.out.println("<-----------------------------------  Last Word  ---------------------------------->");
        String lastWord = "world world";
        System.out.println(lastWord.lastIndexOf(" "));
        System.out.println(solution.lastWord(lastWord));





    }
}
