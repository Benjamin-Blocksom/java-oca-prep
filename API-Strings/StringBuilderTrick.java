class StringBuilderTrick {
    public static void main (String[]args){
    StringBuilder a = new StringBuilder("abc");
    StringBuilder b = a.append("DEF");
    b = b.append("ghi").append("JKL");
    System.out.println(a);
    System.out.println(b);
    }
}
