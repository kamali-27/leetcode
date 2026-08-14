// Last updated: 8/14/2026, 4:00:02 PM
class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(al)","al");
        return command;
    }
}