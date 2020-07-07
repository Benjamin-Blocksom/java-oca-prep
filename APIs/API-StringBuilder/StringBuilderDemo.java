class StringBuilderDemo{
    public static void main (String[]args){
    StringBuilder demo = new StringBuilder("abc");
    demo.append("DEF");
    StringBuilder sameAsDemo = demo.append("ghi");

    System.out.println(demo);
    System.out.println(sameAsDemo); 
    }
}
