class Solution {
public:
    bool isPalindrome(string s) {
        string str = "";
        for(int i=0;i<s.length();i++){
            char ch=s[i];
            if((ch>='a'&&ch<='z')||
            (ch>='A'&&ch<='Z')||
            (ch>='0'&& ch<='9')){
                str+=tolower(ch);
            }
        }
        string rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str[i];
        }
        return str==rev;
    }
};