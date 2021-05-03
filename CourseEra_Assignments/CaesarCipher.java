public class CaesarCipher {
    public String encrypt(String input, int key) {

        String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String aplhabets = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer encrypt = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr >= 'A' && curr <= 'Z') {
                int index = (curr - 'A' + key) % 26;
                encrypt.append(Alphabets.charAt(index));
            } else if (curr >= 'a' && curr <= 'z') {
                int index = (curr - 'a' + key) % 26;
                encrypt.append(aplhabets.charAt(index));
            } else
                encrypt.append(" ");
        }
        return encrypt.toString();
    }

    public String encryptTwoKeys(String input, int key1, int key2) {
        String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String aplhabets = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer encrypt_two = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (i % 2 == 0) {
                if (curr >= 'A' && curr <= 'Z') {
                    int index = (curr - 'A' + key1) % 26;
                    encrypt_two.append(Alphabets.charAt(index));
                } else if (curr >= 'a' && curr <= 'z') {
                    int index = (curr - 'a' + key1) % 26;
                    encrypt_two.append(aplhabets.charAt(index));
                } else
                    encrypt_two.append(" ");
            } else {
                if (curr >= 'A' && curr <= 'Z') {
                    int index = (curr - 'A' + key2) % 26;
                    encrypt_two.append(Alphabets.charAt(index));
                } else if (curr >= 'a' && curr <= 'z') {
                    int index = (curr - 'a' + key2) % 26;
                    encrypt_two.append(aplhabets.charAt(index));
                } else
                    encrypt_two.append(" ");
            }
        }
        return encrypt_two.toString();

    }

    public void testCaeser() {
        System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
        System.out.println(encrypt("First Legion", 23));
        System.out.println(encrypt("First Legion", 17));
        System.out.println(encryptTwoKeys("First Legion", 23, 17));
    }

    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher();
        c.testCaeser();
    }
}
