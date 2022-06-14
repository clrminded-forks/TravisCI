public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String[] strArr = getString().split("");
        // All letters in this word are capitals, like "USA".
        if (getString().equals(getString().toUpperCase()))
            return true;
        // All letters in this word are not capitals, like "leetcode".
        else if (getString().equals(getString().toLowerCase()))
            return true;
        for (int i = 1; i < getString().length(); i++) {
            char capitalizeFirstCharacter = getString().toUpperCase().charAt(0);
            char capitalizeIthCharacter = getString().toUpperCase().charAt(i);
            if (strArr[0].equals(String.valueOf(capitalizeFirstCharacter))
                    && !strArr[i].equals(String.valueOf(capitalizeIthCharacter))) {
                return true;
            }
        }
        return false;
    }

}
