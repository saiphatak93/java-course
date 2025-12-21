public class hash {
    public static void main(String[] args) {

        String name = "azdshhihsdbcjkdskg";
        int[] arr = new int[26];
     
        for (int i = 0; i < name.length(); i++) {
            switch (name.charAt(i)) {
                case 'i':
                    count++;
                    break;
            }
        }

        System.out.println("Count of h = " + count);
    }
}
