package labEx2;

public class StringEx {

    

            public static void main(String[] args){
                String a = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";
                String b = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";
                String c = "Abin";
                System.out.println("charAt-"+a.charAt(1));
                System.out.println("compareTo-"+a.compareTo(b));
                System.out.println("compareTo-"+a.compareTo(c));
                System.out.println("concat-"+a.concat(c));
                System.out.println("contains-"+a.contains("that"));
                System.out.println("endsWith-"+c.endsWith("n"));
                System.out.println("equals-"+a.equals(c));
                System.out.println("equalsIgnoreCase-"+a.equalsIgnoreCase("WERE"));
                System.out.println("format-"+a.format(c));
                System.out.println("replace-"+a.replace("We",c));
                System.out.println("split-"+c.split("-"));
                
                String[] splitText = a.split(" ");
                System.out.println(splitText);
                System.out.println("join-"+c.join("-",splitText));
                System.out.println("startsWith-"+a.startsWith("W"));
                System.out.println("substring-"+a.substring(20, 40));
                System.out.println("toCharArray-"+a.toCharArray());
                System.out.println("toLowerCase-"+a.toLowerCase());
                System.out.println("toUpperCase-"+a.toUpperCase());
                System.out.println("trim-"+a.trim());
                System.out.println("getBytes-");
                byte[] bytes= a.getBytes();
                for (int i = 0; i < bytes.length; i++) {
                    System.out.print(bytes[i]);
                    if (i < bytes.length - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println("indexOf-"+a.indexOf("were"));
                System.out.println("intern-"+a.intern());
                System.out.println("isEmpty-"+a.isEmpty());
                System.out.println("lastIndexOf-"+a.lastIndexOf("villages"));
                System.out.println("length-"+a.length());
                // System.out.println(a.getChars(10,20,c,0));
                System.out.println("valueOf-"+a.valueOf("were"));

            }
    
}
