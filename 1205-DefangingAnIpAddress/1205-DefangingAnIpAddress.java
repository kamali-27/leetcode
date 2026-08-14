// Last updated: 8/14/2026, 4:01:01 PM
class Solution {
    public String defangIPaddr(String address) {
        String rev=address.replace(".","[.]");
        return rev;
    }
}