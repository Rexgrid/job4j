package ex;

public class FindEl {
        public static int indexOf(String[] value, String key) throws ElementNotFoundException {
            int rsl = -1;
            for (int el = 0; el < value.length; el++) {
                if (value[el].equals(key)) {
                    rsl = el;
                    break;
                } else if (el == value.length - 1) {
                  throw new ElementNotFoundException("Element not found.");
                }

            }
                return rsl;
        }

        public static void main(String[] args)  {
            try {
                indexOf(new String[]{"2", "3", "5"}, "1");
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


